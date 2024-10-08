package org.example;

// 해당 코드를 돌려보면 실제 값이 계속해서 바뀜
public class RaceConditionExample {

    // JVM 데이터 영역에 static 변수로 모든 스레드에게 공유됨
    private static int sharedResource = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread[] incrementThreads = new Thread[100];

        for (int i = 0; i < incrementThreads.length; i++) {

            incrementThreads[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    sharedResource++; // 각 스레드가 공유 데이터에 동시에 접근할 수 있고 CPU 할당을 받기 위해 경쟁하게 된다.
                }
            });
            incrementThreads[i].start();
        }

        // 모든 스레드가 작업을 완료할 때까지 기다림
        for (int i = 0; i < incrementThreads.length; i++) {
            incrementThreads[i].join();
        }

        System.out.println("Expected value = " + (100 * 10000));
        System.out.println("Actual value = " + sharedResource);
    }

}
