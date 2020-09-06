package day13;

public class Test {
    public static void main(String[] args) {

        User vasja = new User("Вася");
        User petja = new User("Петя");
        User olja = new User("Оля");

        vasja.subscribe(olja);
        olja.subscribe(vasja);
        olja.subscribe(petja);

        // Диалог Вася - Петя
        vasja.sendMessage(petja, "Привет! Как дела?");
        petja.sendMessage(vasja, "Нормально. А у тебя?");
        vasja.sendMessage(petja, "Да и у меня норм");
        petja.sendMessage(vasja, "Выходи играть во двор");
        petja.sendMessage(vasja, "Если конечно мама отпустит");

        // Диалог Оля - Вася
        olja.sendMessage(vasja, "Вася, привет! Чем занимаешься?");
        vasja.sendMessage(olja, "Домашку делаю. А ты чем?");
        olja.sendMessage(vasja, "А я уже все сделала, сейчас гулять пойду");
        vasja.sendMessage(olja, "Круто! Дай списать?");
        olja.sendMessage(vasja, "Да без проблем. С тебя вкусняшка");
        vasja.sendMessage(olja, "А что ты любишь?");
        olja.sendMessage(vasja, "Пироженки ))");

        MessageDatabase.showDialog(olja, vasja);

    }
}
