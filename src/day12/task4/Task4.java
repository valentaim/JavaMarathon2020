package day12.task4;

public class Task4 {
    public static void main(String[] args) {

        MusicBand rv = new MusicBand("Руки вверх", 1991);
        rv.addArtist("Микки Маус");
        rv.addArtist("Дональд Дак");

        MusicBand b2 = new MusicBand("БИ-2", 1995);
        b2.addArtist("Человек Паук");
        b2.addArtist("Халк");

        rv.printArtists();
        b2.printArtists();

        b2.mergeBand(rv);

        rv.printArtists();
        b2.printArtists();

        b2.removeArtist("Халк");
        b2.printArtists();

    }
}
