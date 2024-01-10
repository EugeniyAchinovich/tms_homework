package lesson_30.practice.task_3;

// Абстрактная фабрика
public interface CourseFactory {
    Developer createDeveloper();

    Language createLanguage();

    LessonProgram createLessonProgram();
}
