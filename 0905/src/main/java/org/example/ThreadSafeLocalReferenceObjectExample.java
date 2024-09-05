package org.example;

// 메서드 안 객체 생성 예제
public class ThreadSafeLocalReferenceObjectExample {
    class LocalObject {
        private int value;

        public void increment() {
            value++;
        }

        @Override
        public String toString() {
            return "LocalObject{" + "value=" + value + '}';
        }
    }

    LocalObject localObject = new LocalObject(); // 이 부분 주석 바꿔가며 실행

    public void useLocalObject() {
        // 지역 객체 참조. 각 스레드는 이 객체의 독립된 인스턴스를 가짐.
//        LocalObject localObject = new LocalObject(); // 이 부분 주석 바꿔가며 실행

        for (int i = 0; i < 5; i++) {
            localObject.increment();
            System.out.println(Thread.currentThread().getName() + " - " + localObject);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeLocalReferenceObjectExample example = new ThreadSafeLocalReferenceObjectExample();

        Thread thread1 = new Thread(() -> {
            example.useLocalObject();
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            example.useLocalObject();
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
