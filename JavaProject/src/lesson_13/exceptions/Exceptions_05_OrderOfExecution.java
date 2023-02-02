package lesson_13.exceptions;

import java.util.Scanner;

public class Exceptions_05_OrderOfExecution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       try {
           System.out.println("What is your age: ");
           int age = input.nextInt();
           // In case of exception - this part of code will be not executed
           System.out.println("age = " + age);
       }
       catch (Exception exception) {
           System.out.println("Чувак ты что - это же вопрос про возраст!");
//           exception.printStackTrace();
       }
       finally {
           System.out.println("Good Bye.");
       }




    }
}
