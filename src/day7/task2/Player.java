package day7.task2;

public class Player {

    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private static final int MAX_PLAYERS = 6;

    public Player() {
        countPlayers = Math.min(++countPlayers, MAX_PLAYERS);
        stamina = (int) (Math.random() * 11) + 90;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public static void info() {

        if (countPlayers < MAX_PLAYERS) {
            int countSeats = MAX_PLAYERS - countPlayers;
            System.out.println("Команды неполные, еще есть " + countSeats + " " + getEnding(countSeats));
        } else {
            System.out.println("Мест в командах больше нет");
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static int getMaxStamina() {
        return MAX_STAMINA;
    }

    private static String getEnding(int count) {
        switch (count) {
            case 1:
                return "свободное место";
            case 2:
            case 3:
            case 4:
                return "свободных места";
            default:
                return "свободных мест";
        }
    }

}
