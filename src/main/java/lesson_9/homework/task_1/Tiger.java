package lesson_9.homework.task_1;

public final class Tiger extends Animal {
    @Override
    void voice() {
        System.out.println("Roar!");
    }

    @Override
    void eat(String meal) {
        if (meal.equals("meat"))
            System.out.println("Tiger eats meet");
        else
            System.out.println("Tiger does not eat " + meal);
    }
}
