package day8;

public class Task1 {
    public static void main(String[] args) {

        // Способ 1
        String numbers = "";
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            numbers += (i + " ");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(numbers);

        // Способ 2
        StringBuilder sb = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(sb.toString());

        System.out.println("Время выполнения 1: " + (endTime1 - startTime1));
        System.out.println("Время выполнения 2: " + (endTime2 - startTime2));

    }
}
