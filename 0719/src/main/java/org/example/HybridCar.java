package org.example;

import lombok.ToString;

@ToString(callSuper = true)
public class HybridCar extends Car {
    int electricGauge;

    public HybridCar() {}

    public HybridCar(int gasolineGauge, int electricGauge) {
        super.gasolineGauge = gasolineGauge;
        this.electricGauge = electricGauge;
    }

    public void showCurrentGauge() {
        System.out.println("gasolineGauge = " + gasolineGauge);
        System.out.println("electricGauge = " + electricGauge);
    }
}
