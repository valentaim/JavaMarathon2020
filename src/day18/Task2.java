package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int number) {

        String numStr = String.valueOf(number);
        String firstSymbol = numStr.substring(0, 1);
        int sum = 0;

        if (firstSymbol.equals("7")) {
            sum = 1;
        }

        if (numStr.length() > 1) {
            return sum + count7(Integer.parseInt(numStr.substring(1)));
        } else {
            return sum;
        }

    }
}
