package lesson_11.practice.task_3;

import java.io.IOException;

public class Gearbox {
    int gearsCount;
    int[] gearRatios;

    float efficiency;
    float shiftDelay;
    float clutchInertia;

    String controlType;

    int currentGear = 0;

    public Gearbox(int[] gearRatios,
                   float efficiency, float shiftDelay, float clutchInertia,
                   String controlType) {
        this.gearRatios = gearRatios;
        this.gearsCount = gearRatios.length;
        this.efficiency = efficiency;
        this.shiftDelay = shiftDelay;
        this.clutchInertia = clutchInertia;
        this.controlType = controlType;
    }

    public void shiftAt(int gearIndex) {
        try {
            currentGear = gearRatios[gearIndex];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
