package lesson_04.operators;

public class OperatorOr {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println(a + " || " + b + " = " + (a || b));
        System.out.println(a + " || " + c + " = " + (a || c));
        System.out.println(c + " || " + d + " = " + (c || d));
    }
}
