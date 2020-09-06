package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private final String name;
    private final int year;
    private final List<MusicArtist> artists;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        artists = new ArrayList<>();
    }

    public void addArtist(MusicArtist artist) {
        artists.add(artist);
    }

    public void removeArtist(MusicArtist artist) {
        artists.remove(artist);
    }

    public List<MusicArtist> getArtists() {
        return artists;
    }

    public void clearArtists() {
        artists.clear();
    }

    public void mergeBand(MusicBand band) {
        for (MusicArtist artist : band.getArtists()) {
            addArtist(artist);
        }
        band.clearArtists();
    }

    public void printArtists() {
        System.out.println("Список участников группы " + name + ":");
        for (MusicArtist artist : artists) {
            System.out.println(artist);
        }
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }
}
