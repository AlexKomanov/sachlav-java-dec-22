package lesson_06.methods;

public class Methods_04_ReturnWithParams {
    public static void main(String[] args) {

        System.out.println(sumNumbers(1, 5));

        int c = sumNumbers(4, 6);

        int first = 6;
        int second = 8;

        System.out.println(sumNumbers(first, second));

    }

    public static int sumNumbers(int a, int b) {
        return a + b;
    }
}
