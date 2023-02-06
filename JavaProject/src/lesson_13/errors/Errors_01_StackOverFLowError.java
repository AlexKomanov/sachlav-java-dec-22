package lesson_13.errors;

public class Errors_01_StackOverFLowError {
    public static void main(String[] args) {

        calculate(10);
        calculate(10);
    }

    public static int calculate(int number) {
        return number * calculate(number - 1);
    }
}
