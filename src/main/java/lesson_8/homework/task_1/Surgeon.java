package lesson_8.homework.task_1;

public class Surgeon implements Treatable {
    @Override
    public void Treat(Patient patient) {
        System.out.println("Хирург принял пациента");
        patient.setTreated(true);
    }
}
