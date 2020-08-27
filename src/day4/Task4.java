package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        System.out.println(Arrays.toString(arr));
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int sum = arr[i - 1] + arr[i] + arr[i + 1];
            if (sum >= maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(maxIndex - 1);

    }
}
