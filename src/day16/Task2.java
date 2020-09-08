package day16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {

        Path file1 = Paths.get("./src/day16/file1.txt");
        Path file2 = Paths.get("./src/day16/file2.txt");

        // Формирование и запись файла 1
        List<String> linesFile1 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int n = (int) (Math.random() * 100);
            linesFile1.add(String.valueOf(n));
        }
        Files.write(file1, linesFile1);

        // Чтение файла 1
        linesFile1 = Files.readAllLines(file1);

        // Формаирование и запись файла 2
        List<String> linesFile2 = new ArrayList<>();
        int counter = 0;
        double sum = 0;
        for (String line : linesFile1) {
            counter++;
            sum += Integer.parseInt(line);
            if (counter % 20 == 0) {
                linesFile2.add(String.valueOf(sum / 20));
                sum = 0;
            }
        }
        Files.write(file2, linesFile2);

        // Чтение файла 2
        linesFile2 = Files.readAllLines(file2);

        // Вычисление суммы чисел файла 2
        int intSum = (int) linesFile2.stream().mapToDouble(Double::parseDouble).sum();
        System.out.println(intSum);

    }
}
