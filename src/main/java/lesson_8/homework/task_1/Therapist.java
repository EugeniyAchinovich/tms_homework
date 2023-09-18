package lesson_8.homework.task_1;

public class Therapist implements Treatable {
    @Override
    public void Treat(Patient patient) {
        System.out.println("Терапевт принял пациента");
        patient.setTreated(true);
    }

    // Изменяет лечащего врача пациенту в зависимости от кода лечения
    public void SetTreatMethod(Patient patient) {
        String doctorSpeciality = switch (patient.getTreatMethodCode()) {
            case 1 -> "Surgeon";
            case 2 -> "Dentist";
            default -> "Therapist";
        };
        patient.setCurrentDoctor(doctorSpeciality);
    }
}
