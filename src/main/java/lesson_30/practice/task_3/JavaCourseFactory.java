package lesson_30.practice.task_3;

// Реализация абстрактной фабрики для языка Java
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new JavaLanguage();
    }

    @Override
    public LessonProgram createLessonProgram() {
        return new JavaLessonProgram();
    }
}
