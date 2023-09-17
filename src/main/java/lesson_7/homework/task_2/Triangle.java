package lesson_7.homework.task_2;

public class Triangle extends Shape {
    int a, b, c;
    int angle_a, angle_b, angle_c;

    Triangle(int a, int b, int c, int angle_a, int angle_b, int angle_c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.angle_a = angle_a;
        this.angle_b = angle_b;
        this.angle_c = angle_c;
    }

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
