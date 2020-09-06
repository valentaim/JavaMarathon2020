package day14.task3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<Person> parseFileToObjList() throws IOException {

        String filename = "./src/day14/people.txt";
        if (!Files.exists(Paths.get(filename))) {
            throw new FileNotFoundException("Файл не найден");
        }

        List<String> lines = Files.readAllLines(Paths.get(filename));

        List<Person> people = new ArrayList<>();
        for (String line : lines) {
            String[] elements = line.split("\\s");
            if (elements.length != 2 || Integer.parseInt(elements[1]) < 0) {
                throw new IOException("Некорректный входной файл");
            }
            people.add(new Person(elements[0], Integer.parseInt(elements[1])));
        }
        return people;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
