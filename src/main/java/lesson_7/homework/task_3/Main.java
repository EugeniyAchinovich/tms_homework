package lesson_7.homework.task_3;

public class Main {
    public static void main(String[] args) {
        // "Базовая" модель VW Golf. На её основе создадим другие Гольфы, но с изменёнными характеристиками
        AutoData data_VW_Golf_base = new AutoData("Volkswagen Golf MK7", "Синий", "Хетчбек",
                "1.4 TSI DSG Style", "1.4L рядный 4-цилиндровый с турбокомпрессором",
                "Робот 6-ст DSG DQ250", "Yokohama 215x35 R17", "1280", "149",
                "8.8", "0.28");

        try {
            // Создадим точно такой же автомобиль, только белого цвета
            // Для этого клонируем от базовой модели и меняем только название цвета
            AutoData data_VW_Golf_base_white = (AutoData) data_VW_Golf_base.clone();
            data_VW_Golf_base_white.bodyColor = "Белый";

            // Создадим такой автомобиль, только в другой (спортивной) комплектации
            // Клонируем от базовой модели и меняем значения некоторых характеристик
            AutoData data_VW_Golf_gti = (AutoData) data_VW_Golf_base.clone();
            data_VW_Golf_gti.trimLevelName = "2.0 TSI DSG GTI";
            data_VW_Golf_gti.engineName = "2.0L рядный 4-цилиндровый с турбокомпрессором";
            data_VW_Golf_gti.gearboxName = "Робот 7-ст DSG DQ381-7F";
            data_VW_Golf_gti.weight = "1345";
            data_VW_Golf_gti.horsepower = "230";
            data_VW_Golf_gti.acceleration0to100 = "6.5";

            // Выводим данные о трёх автомобилях
            data_VW_Golf_base.Display();
            data_VW_Golf_base_white.Display();
            data_VW_Golf_gti.Display();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
