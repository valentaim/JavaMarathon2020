package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private final String name;
    private final int year;
    private final List<String> artists;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        artists = new ArrayList<>();
    }

    public void addArtist(String artist) {
        artists.add(artist);
    }

    public void removeArtist(String artist) {
        artists.remove(artist);
    }

    public List<String> getArtists() {
        return artists;
    }

    public void clearArtists() {
        artists.clear();
    }

    public void mergeBand(MusicBand band) {
        for (String artist : band.getArtists()) {
            addArtist(artist);
        }
        band.clearArtists();
    }

    public void printArtists() {
        System.out.println("Список участников группы " + name + ":");
        for (String artist : artists) {
            System.out.println(artist);
        }
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }
}
