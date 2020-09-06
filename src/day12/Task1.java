package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("Жигули");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Range Rover");
        cars.add("Nissan");

        cars.forEach(System.out::println);
        System.out.println();

        cars.add(3, "Audi");
        cars.remove(0);

        cars.forEach(System.out::println);

    }
}
