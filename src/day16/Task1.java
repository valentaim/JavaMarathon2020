package day16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {

        Path file_in = Paths.get("./src/day16/data.txt");
        List<String> lines = Files.readAllLines(file_in);
        double avg = (double) lines.stream().mapToInt(Integer::parseInt).sum() / lines.size();
        System.out.printf("%s --> %.3f", avg, avg);

    }
}
