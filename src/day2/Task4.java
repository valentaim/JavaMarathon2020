package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        double x = new Scanner(System.in).nextDouble();
        double y;
        if (x > -3 && x < 5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else {
            y = 420;
        }
        System.out.println("y = " + y);

    }
}
