package lesson_03_01.homeTasks;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth month number:");

        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("Jan - Capricorn, Aquarius");
                break;
            case 2:
                System.out.println("Feb - Aquarius, Pisces");
                break;
            case 3:
                System.out.println("Mar - Pisces, Aries");
                break;
            case 4:
                System.out.println("Apr - Aries, Taurus");
                break;
            case 5:
                System.out.println("May - Taurus, Gemini");
                break;
            case 6:
                System.out.println("Jun - Gemini, Cancer");
                break;
            case 7:
                System.out.println("Jul - Cancer, Leo");
                break;
            case 8:
                System.out.println("Aug - Leo, Virgo");
                break;
            case 9:
                System.out.println("Sep - Virgo, Libra");
                break;
            case 10:
                System.out.println("Oct - Libra, Scorpio");
                break;
            case 11:
                System.out.println("Nov - Scorpio, Sagittarius");
                break;
            case 12:
                System.out.println("Dec - Sagittarius, Capricorn");
                break;
            default:
                System.out.println("Wrong number...");
        }

        input.close();
    }
}
