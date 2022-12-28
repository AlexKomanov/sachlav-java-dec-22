package lesson_04.classTasks;

public class Task_02_EvenNumbersForLoop {
    public static void main(String[] args) {

        int count = 551;

        for (int i = count; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
