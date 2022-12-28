package lesson_04.classTasks;

import java.util.Scanner;

public class Task_01_WorkersBonus {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        double bonus = 0.0;

        System.out.println("Какая у вас зарплата? ");
        double currentSalary = input.nextDouble();

        System.out.println("Какой у вас опыт работы? ");
        int experience = input.nextInt();

        if(experience >= 0 && experience < 5) {
            bonus = currentSalary * 0.1;
        }
        else if(experience >= 5 && experience < 10) {
            bonus = currentSalary * 0.15;
        }
        else if(experience >= 10 && experience < 15) {
            bonus = currentSalary * 0.25;
        }
        else if(experience >= 15 && experience < 20) {
            bonus = currentSalary * 0.35;
        }
        else if(experience >= 20 && experience < 25) {
            bonus = currentSalary * 0.45;
        }
        else if(experience >= 25 ) {
            bonus = currentSalary * 0.5;

        }

        System.out.println("Bonus = " + bonus);
        System.out.println("New Salary = " + (currentSalary + bonus));
    }
}
