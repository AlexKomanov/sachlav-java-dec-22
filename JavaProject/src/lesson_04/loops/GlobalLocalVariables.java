package lesson_04.loops;

public class GlobalLocalVariables {
    public static void main(String[] args) {

        String textOutside = "Outside Loop";
        System.out.println("textOutside = " + textOutside);

        for (int i = 0; i < 1; i++) {
            textOutside = "Now we are inside loop";
            int a = 5;
            System.out.println("a = " + a);
        }

//        System.out.println("a = " + a); a -> local variable inside for loop


        System.out.println("textOutside = " + textOutside);

        var ab = true;

 //       ab = ""; <- error

    }
}
