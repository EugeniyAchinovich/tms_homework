package lesson_30.practice.task_3;

public class Main {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Developer developer = factory.createDeveloper();
        Language language = factory.createLanguage();
        LessonProgram lessonProgram = factory.createLessonProgram();

        developer.teach();
        language.learn();
        lessonProgram.study();
    }
}
