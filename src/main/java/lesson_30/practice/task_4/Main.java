package lesson_30.practice.task_4;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer.DeveloperBuilder("John")
                .setExperienceYears(10)
                .build();
        Developer developer2 = new Developer.DeveloperBuilder("Amanda")
                .setExperienceYears(3)
                .build();
        Developer developer3 = new Developer.DeveloperBuilder("Mark Hoffman")
                .setExperienceYears(4)
                .build();
        Developer developer4 = new Developer.DeveloperBuilder("Laurence Gordon")
                .setExperienceYears(5)
                .build();
    }
}
