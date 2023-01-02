package lesson_03_01.homeTasks;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {

        String username = "Admin";
        String password = "P@ssword";

        Scanner input = new Scanner(System.in);
        System.out.println("Введите логин");

        if (input.nextLine().equals(username)) {
            System.out.println("Введите пароль");
            if (input.nextLine().equals(password)) {
                System.out.println("Здравствуйте " + username + ", Вы вошли в систему.");
            }
            else {
                System.out.println("Вы ввели неверный пароль!");
            }
        }
        else {
            System.out.println("Нет пользователя с таким именем!");
        }

        input.close();
    }
}
