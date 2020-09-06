package day14.task3;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {

        List<Person> people = Person.parseFileToObjList();
        System.out.println(Arrays.toString(people.toArray()));

    }
}
