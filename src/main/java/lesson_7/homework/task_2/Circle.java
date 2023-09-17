package lesson_7.homework.task_2;

public class Circle extends Shape {
    int r;

    Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }
}
