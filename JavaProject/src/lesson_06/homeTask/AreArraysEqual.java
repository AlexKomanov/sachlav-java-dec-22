package lesson_06.homeTask;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AreArraysEqual {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter amount of numbers for first array ");
        int amountArray = input.nextInt();
        int array[] = new int[amountArray];
        System.out.println("Enter amount of numbers for second array ");
        int amountArray2 = input.nextInt();
        int array2[] = new int[amountArray2];
        for (int i = 0; i < amountArray; i++) {
            System.out.println("Enter numbers for first array. You still need to enter " + (amountArray - i) + " numbers");
            array[i] = input.nextInt();
            if (amountArray == array[i]) {
                System.out.println("Thank you for adding numbers for first array");
            }
        }
        for (int i = 0; i < amountArray2; i++) {
            System.out.println("Enter numbers for second array. You still need to enter " + (amountArray2 - i) + " numbers");
            array2[i] = input.nextInt();
            if (amountArray2 == array2[i]) {
                System.out.println("Thank you for adding numbers for second array");
            }
        }
        System.out.println("compareWithArrays(array, array2) = " + compareWithArrays(array, array2));
        System.out.println("compareWithIntStream(array, array2) = " + compareWithIntStream(array, array2));
        System.out.println("compareWithCustomMethod(array, array2) = " + compareWithCustomMethod(array, array2));
    }

    public static boolean compareWithArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean compareWithIntStream(int[] array1, int[] array2) {
        return IntStream.range(0, array1.length).noneMatch(i -> array2[i] != array1[i]);
    }

    public static boolean compareWithCustomMethod (int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }

            }
            return true;

        }
        return false;
    }
}

