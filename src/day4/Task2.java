package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        System.out.println(Arrays.toString(arr));

        int max = 0, min = 10000, countZero = 0, sumZero = 0;
        for (int x : arr) {
            max = Math.max(x, max);
            min = Math.min(x, min);
            if (x % 10 == 0) {
                countZero++;
                sumZero += x;
            }
        }

        System.out.println("Наибольший элемент: " + max);
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Количество элементов, оканчивающихся на 0: " + countZero);
        System.out.println("Сумма элементов, оканчивающихся на 0: " + sumZero);

    }
}
