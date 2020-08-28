package day5.task1;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2020);
        car.setColor("Красный");
        car.setModel("Ferrari");

        System.out.println("Модель: " + car.getModel());
        System.out.println("Год: " + car.getYear());
        System.out.println("Цвет: " + car.getColor());

    }
}
