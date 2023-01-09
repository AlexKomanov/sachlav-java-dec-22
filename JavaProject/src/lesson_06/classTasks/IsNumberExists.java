package lesson_06.classTasks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IsNumberExists {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] myArray = {1, 2, 3, 4, 5};
        Integer[] arrayOfIntegers = {1, 2, 3, 4, 5};

        System.out.println("Please enter your number: ");

        int myNumber = input.nextInt();

        System.out.println("checkNumberInArray(myNumber, myArray) = " + checkNumberInArray(myNumber, myArray));
        System.out.println("checkNumberInArrayWithStream(myNumber, myArray) = " + checkNumberInArrayWithStream(myNumber, myArray));
        System.out.println("checkNumberInArrayWithList(myNumber, myArray) = " + checkNumberInArrayWithList(myNumber, arrayOfIntegers));

    }

    public static boolean checkNumberInArray(int myValue, int[] array) {
        for (int number : array) {
            if (myValue == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNumberInArrayWithStream(int myValue, int[] array) {
        int foundValue = IntStream
                .range(0, array.length)
                .filter(i -> myValue == array[i])
                .findFirst()
                .orElse(-1);
        return foundValue != -1;
    }

    public static boolean checkNumberInArrayWithList(int myValue, Integer[] array) {
        int foundedValue = Arrays.asList(array).indexOf(myValue);
        return foundedValue != -1;
    }
}
