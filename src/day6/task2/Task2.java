package day6.task2;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing", 2019, 20, 100);
        airplane.setYear(2020);
        airplane.setLength(25);
        airplane.fillUp(20);
        airplane.fillUp(30);
        airplane.info();

    }
}
