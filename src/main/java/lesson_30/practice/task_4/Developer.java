package lesson_30.practice.task_4;

// Класс Developer с необязательными параметрами
public class Developer {
    private String name;
    private String language;
    private int experienceYears;

    private Developer(DeveloperBuilder builder) {
        this.name = builder.name;
        this.language = builder.language;
        this.experienceYears = builder.experienceYears;
    }

    // Внутренний статический класс Builder
    public static class DeveloperBuilder {
        private String name;
        private String language;
        private int experienceYears;

        public DeveloperBuilder(String name) {
            this.name = name;
        }

        public DeveloperBuilder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public DeveloperBuilder setExperienceYears(int experienceYears) {
            this.experienceYears = experienceYears;
            return this;
        }

        public Developer build() {
            return new Developer(this);
        }
    }
}
