package lesson_7.homework.task_3;


// Класс описания некоторых основных характеристик автомобиля
public class AutoData implements Cloneable {
    public String carName;
    public String bodyColor;
    public String bodyType;
    public String trimLevelName;
    public String engineName;
    public String gearboxName;
    public String wheelsName;
    public String weight;
    public String horsepower;
    public String acceleration0to100;
    public String dragCoefficient;

    public AutoData(
            String carName, String bodyColor, String bodyType, String trimLevelName,
            String engineName, String gearboxName, String wheelsName, String weight,
            String horsepower, String acceleration0to100, String dragCoefficient) {
        this.carName = carName;
        this.bodyColor = bodyColor;
        this.bodyType = bodyType;
        this.trimLevelName = trimLevelName;
        this.engineName = engineName;
        this.gearboxName = gearboxName;
        this.wheelsName = wheelsName;
        this.weight = weight;
        this.horsepower = horsepower;
        this.acceleration0to100 = acceleration0to100;
        this.dragCoefficient = dragCoefficient;
    }

    public void Display() {
        System.out.println();
        System.out.println("Автомобиль                 : " + carName);
        System.out.println("Название комплектации      : " + trimLevelName);
        System.out.println("Цвет                       : " + bodyColor);
        System.out.println("Тип кузова                 : " + bodyType);
        System.out.println("Снаряжённая масса, кг      : " + weight);
        System.out.println("Максимальная мощность, лс  : " + horsepower);
        System.out.println("Время разгона 0-100км/ч, с : " + acceleration0to100);
        System.out.println("Двигатель                  : " + engineName);
        System.out.println("Коробка передач            : " + gearboxName);
        System.out.println("Колёса                     : " + wheelsName);
        System.out.println("Аэродинамический коэффицент: " + dragCoefficient);
        System.out.println();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
