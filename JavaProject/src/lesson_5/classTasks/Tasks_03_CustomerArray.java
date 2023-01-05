package lesson_5.classTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Tasks_03_CustomerArray {
    public static void main(String[] args) {

       ArrayList<Double> arrayList = new ArrayList<>();

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;


        System.out.println("arrayList.size() = " + arrayList.size());
        for (int i = 0; i < 10; i++) {
            arrayList.add(Math.random() * 100);
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\narrayList.size() = " + arrayList.size());

        for (Double number : arrayList) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            sum += number;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + (sum / arrayList.size()));

        arrayList.forEach(number -> System.out.println(number));
    }
}
