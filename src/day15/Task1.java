package day15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    private static final Path file_in = Paths.get("./src/day15/shoes.csv");
    private static final Path file_out = Paths.get("./src/day15/out.txt");

    public static void main(String[] args) throws IOException {

        if (!Files.exists(file_in)) {
            throw new FileNotFoundException("Файл не найден");
        }

        List<Shoes> shoesList = new ArrayList<>();
        List<String> lines = Files.readAllLines(file_in);
        for (int i = 1; i < lines.size(); i++) {
            String[] elements = lines.get(i).split(";");
            if (elements.length != 3) {
                throw new IOException("Некорректный формат файла");
            }
            Shoes shoes = new Shoes(
                    elements[0].trim(),
                    Integer.parseInt(elements[1]),
                    Integer.parseInt(elements[2])
            );
            shoesList.add(shoes);
        }

        List<String> linesForWrite = shoesList.stream()
                .filter(s -> s.getQuantity() == 0)
                .map(Shoes::toString).collect(Collectors.toList());
        Files.write(file_out, linesForWrite);

    }
}
