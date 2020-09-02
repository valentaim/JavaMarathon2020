package day9.task2;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = 0.5 * perimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
