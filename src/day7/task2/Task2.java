package day7.task2;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player.info();
        Player player2 = new Player();
        Player.info();
        Player player3 = new Player();
        Player.info();
        Player player4 = new Player();
        Player.info();
        Player player5 = new Player();
        Player.info();
        Player player6 = new Player();
        Player.info();

        // Проверка ограничения количества игроков
        Player player7 = new Player();
        Player player8 = new Player();
        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());

        // Проверка ухода игрока с поля
        for (int i = 0; i < Player.getMaxStamina() + 10; i++) {
            player1.run();
        }
        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());

    }
}
