package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Task2 {

    private static final String FILENAME = "./src/day14/people.txt";

    public static void main(String[] args) throws IOException {

        List<String> lines = parseFileToStringList();
        System.out.println(Arrays.toString(lines.toArray()));

    }

    private static List<String> parseFileToStringList() throws IOException {
        File file = new File(FILENAME);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден");
        }
        Scanner scanner = new Scanner(file);
        List<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] elements = line.split("\\s");
            if (elements.length != 2 || Integer.parseInt(elements[1]) < 0) {
                throw new IOException("Некорректный входной файл");
            }
            lines.add(line);
        }
        return lines;
    }

}
