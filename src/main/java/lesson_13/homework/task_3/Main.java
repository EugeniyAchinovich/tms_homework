package lesson_13.homework.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int N = 30;

    public static float averageMark(Student student) {
        int sum = 0;
        for (int mark : student.marks)
            sum += mark;

        return (float)sum / student.marks.length;
    }

    public static void operateStudents(List<Student> students) {
        for (Student student : students)
            if (averageMark(student) < 3)
                students.remove(student);
            else
                student.setCourse(student.getCourse() + 1);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println(" === Список студентов " + course + " курса === ");
        for (Student student : students)
            if (student.course == course)
                System.out.print(student + " " + averageMark(student));
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        String _names =
                "Ethan Thompson\n" +
                "Olivia Parker\n" +
                "Noah Davis\n" +
                "Ava Wilson\n" +
                "Liam Martinez\n" +
                "Emma Anderson\n" +
                "Jacob Taylor\n" +
                "Mia Harris\n" +
                "Benjamin Clark\n" +
                "Isabella Rodriguez\n" +
                "William Lewis\n" +
                "Sophia Hall\n" +
                "James Brown\n" +
                "Amelia Wright\n" +
                "Alexander Young\n" +
                "Charlotte Turner\n" +
                "Oliver Lee\n" +
                "Harper Adams\n" +
                "Elijah Hill\n" +
                "Elizabeth Robinson\n" +
                "Henry Walker\n" +
                "Grace White\n" +
                "Daniel Green\n" +
                "Emily Moore\n" +
                "Jackson Martin\n" +
                "Abigail Garcia\n" +
                "Samuel Thompson\n" +
                "Evelyn Bailey\n" +
                "Matthew Carter\n" +
                "Madison Reed";

        String[] names = _names.split("\n");

        for (int i = 0; i < N; i++) {
            String name = names[(int)(Math.random() * N)];
            String groupNum = "GROUP0" + (int)(Math.random() * 100);
            int course = 1 + (int)(Math.random() * 5);
            int[] marks = new int[10];
            for (int j = 0; j < marks.length; j++)
                marks[j] = 1 + (int)(Math.random() * 10);

            Student student = new Student(name, groupNum, course, marks);
            students.add(student);
        }

        System.out.println(students);

        operateStudents(students);
        System.out.println(students);

        printStudents(students, 3);
    }
}
