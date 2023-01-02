package lesson_03_01.homeTasks;

import java.util.Objects;
import java.util.Scanner;

public class ObjectsCompare {
    public static void main(String[] args) {

        String username = "Admin";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        boolean equals = Objects.equals(username, input.nextLine());
        System.out.println("equals = " + equals);

    }
}
