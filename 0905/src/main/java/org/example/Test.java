package org.example;

public class Test {

    class ValueTest {
        private int value;

        public void increment(){
            value++;
        }

        @Override
        public String toString() {
            return "ValueTest{" +
                    "value=" + value +
                    '}';
        }
    }

    ValueTest valueTest = new ValueTest();

    public void OtherIncrement() {
        for (int i = 0; i < 5; i++) {
            valueTest.increment();
        }
        System.out.println(valueTest);
    }


    public static void main(String[] args) {
        Test test = new Test();

        test.OtherIncrement();
    }
}
