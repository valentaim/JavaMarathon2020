package day4;

public class Task3 {
    public static void main(String[] args) {

        int m = 12;
        int n = 8;

        int maxIndex = 0;
        int maxSum = 0;

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            int sumLine = 0;
            for (int j = 0; j < n; j++) {
                int x = (int) (Math.random() * 50);
                arr[i][j] = x;
                sumLine += x;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
            if (sumLine >= maxSum) {
                maxSum = sumLine;
                maxIndex = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой элементов: " + maxIndex);

    }
}
