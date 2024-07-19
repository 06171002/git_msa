package org.example;

public class Ex05 {

    public static void main(String[] args) {

        Car car = new Car();
        HybridCar hybridCar = new HybridCar();
        HybridWaterCar hybridWaterCar = new HybridWaterCar(1,2,3);
        Car car1 = new HybridWaterCar();
        HybridWaterCar hybridWaterCar1 = new HybridWaterCar(6,7);

        car.showCurrentGauge();
//        hybridCar.showCurrentGauge();
//        hybridWaterCar.showCurrentGauge();
//        car1.showCurrentGauge();
        System.out.println(hybridWaterCar.toString());
        hybridWaterCar1.showCurrentGauge();
    }
}
