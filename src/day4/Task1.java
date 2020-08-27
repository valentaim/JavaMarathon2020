package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        int moreEight = 0, one = 0, even = 0, odd = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 10);
            array[i] = x;
            if (x > 8) {
                moreEight++;
            }
            if (x == 1) {
                one++;
            }
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += x;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больших 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
