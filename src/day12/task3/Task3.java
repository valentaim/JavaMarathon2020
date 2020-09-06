package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bands = Arrays.asList(
                new MusicBand("Сплин", 1995),
                new MusicBand("Басков", 2001),
                new MusicBand("Группа Звери", 2002),
                new MusicBand("Чай вдвоем", 1999),
                new MusicBand("Децл", 1992),
                new MusicBand("Кирпичи", 1993),
                new MusicBand("Лабода", 2010),
                new MusicBand("Артур Пирожков", 2018),
                new MusicBand("Руки вверх", 1991),
                new MusicBand("Ленинград", 2005)
        );
        Collections.shuffle(bands, new Random(10));

        List<MusicBand> newBands = new ArrayList<>();
        bands.forEach(e -> {
            if (e.getYear() > 2000) {
                newBands.add(e);
            }
        });

        bands.forEach(System.out::println);
        System.out.println();
        newBands.forEach(System.out::println);

    }
}
