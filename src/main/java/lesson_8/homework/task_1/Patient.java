package lesson_8.homework.task_1;

public class Patient {
    int treatMethodCode;
    String currentDoctor;
    boolean isTreated;

    public boolean isTreated() {
        return isTreated;
    }

    public void setTreated(boolean treated) {
        isTreated = treated;
    }

    Patient() {
        isTreated = false;
    }

    public int getTreatMethodCode() {
        return treatMethodCode;
    }

    public void setTreatMethodCode(int treatMethodCode) {
        this.treatMethodCode = treatMethodCode;
    }

    public String getCurrentDoctor() {
        return currentDoctor;
    }

    public void setCurrentDoctor(String currentDoctor) {
        this.currentDoctor = currentDoctor;
    }
}
