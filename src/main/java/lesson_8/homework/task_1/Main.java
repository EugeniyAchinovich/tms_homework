package lesson_8.homework.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаём докторов и пациента
        Patient patient = new Patient();

        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();
        Surgeon surgeon = new Surgeon();

        System.out.print("Введите код лечения. 1 - хирург. 2 - дантист. <...> - теравевт: ");
        patient.setTreatMethodCode(scanner.nextInt());

        // Терапевт задаёт пациенту план лечения
        therapist.SetTreatMethod(patient);

        // Пациент "выбирает" доктора согласно плану, назначенному терапевтом
        // Доктора "лечат" пациента с выводом на экран соответствующего сообщения
        switch (patient.getCurrentDoctor()) {
            case "Surgeon" -> surgeon.Treat(patient);
            case "Dentist" -> dentist.Treat(patient);
            case "Therapist" -> therapist.Treat(patient);
        }
    }
}
