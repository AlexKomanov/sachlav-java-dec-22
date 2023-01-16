package lesson_07.homeTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCats {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Cat> cats = new ArrayList<>();
        int catsCount;

        System.out.print("How many cats you want to add?: ");
        catsCount = input.nextInt();

        for (int i = 0; i < catsCount; i++) {
            System.out.print("Enter " + (i + 1) + " cat name: ");
            String name = input.next();

            System.out.print("Enter " + (i + 1) + " cat color: ");
            String color = input.next();

            System.out.print("Enter " + (i + 1) + " cat age: ");
            int age = input.nextInt();

            cats.add(new Cat(name, color, age));
        }

        input.close();

        cats.forEach(cat -> System.out.println(cat.toString()));
    }
}
