package org.example;

import lombok.ToString;

@ToString
public class Car {
    int gasolineGauge;

    public Car() {}

    public Car(int gasolineGauge) {
        this.gasolineGauge = gasolineGauge;
    }

    public void showCurrentGauge() {
        System.out.println("gasolineGauge = " +gasolineGauge);
    }
}
