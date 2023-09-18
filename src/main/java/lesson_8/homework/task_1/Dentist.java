package lesson_8.homework.task_1;

public class Dentist implements Treatable {
    @Override
    public void Treat(Patient patient) {
        System.out.println("Дантист принял пациента");
        patient.setTreated(true);
    }
}
