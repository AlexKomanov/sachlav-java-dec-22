package lesson_04.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert you number: ");
        int a = scanner.nextInt();

//        while (a < 10) {
//            System.out.println("a = " + a);
//            a++;
//        }


        do {
            System.out.println("before a++ " + a);
            a++;
            System.out.println("after a++ " + a);
        }
        while (a < 10);


    }
}
