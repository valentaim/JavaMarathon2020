package day14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {

        String filename = "./src/day14/data.txt";
        if (!Files.exists(Paths.get(filename))) {
            throw new FileNotFoundException("Файл не найден");
        }

        List<String> lines = Files.readAllLines(Paths.get(filename));
        if (lines.size() != 10) {
            throw new IOException("Некорректный входной файл");
        }

        int sum = 0;
        for (String line : lines) {
            sum += Integer.parseInt(line);
        }
        System.out.println(sum);
    }

}
