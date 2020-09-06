package day12.task5;

public class Task4 {
    public static void main(String[] args) {

        MusicBand rv = new MusicBand("Руки вверх", 1991);
        rv.addArtist(new MusicArtist("Микки Маус", 21));
        rv.addArtist(new MusicArtist("Дональд Дак", 22));

        MusicBand b2 = new MusicBand("БИ-2", 1995);
        b2.addArtist(new MusicArtist("Человек Паук", 16));

        MusicArtist hulk = new MusicArtist("Халк", 36);
        b2.addArtist(hulk);

        rv.printArtists();
        b2.printArtists();

        b2.mergeBand(rv);

        rv.printArtists();
        b2.printArtists();

        b2.removeArtist(hulk);
        b2.printArtists();

    }
}
