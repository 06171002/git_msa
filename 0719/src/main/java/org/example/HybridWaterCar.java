package org.example;


import lombok.ToString;

@ToString(callSuper = true)
public class HybridWaterCar extends HybridCar {
    int waterGauge;

    public HybridWaterCar() {}

    public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
        super.gasolineGauge = gasolineGauge;
        super.electricGauge = electricGauge;
        this.waterGauge = waterGauge;
    }

    public void showCurrentGauge() {
        System.out.println("잔여 가솔린" + gasolineGauge);
        System.out.println("잔여 전기량" + electricGauge);
        System.out.println("잔여 워터량" + waterGauge);
    }

    public HybridWaterCar(int electricGauge, int waterGauge) {
        super.electricGauge =  electricGauge;
        this.waterGauge = waterGauge;
    }

}
