package lesson_9.homework.task_1;

public final class Rabbit extends Animal {
    @Override
    void voice() {
        System.out.println("Squeak!");
    }

    @Override
    void eat(String meal) {
        if (meal.equals("grass"))
            System.out.println("Rabbit eats grass");
        else
            System.out.println("Rabbit does not eat" + meal);
    }
}
