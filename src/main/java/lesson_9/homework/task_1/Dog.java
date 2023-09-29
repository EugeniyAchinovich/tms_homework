package lesson_9.homework.task_1;

public final class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("Bark!");
    }

    @Override
    void eat(String meal) {
        if (meal.equals("dogfood"))
            System.out.println("Dog eats dog food");
        else
            System.out.println("Dog does not eat" + meal);
    }
}
