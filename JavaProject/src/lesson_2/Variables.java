package lesson_2;

public class Variables {
    public static void main(String[] args) {
        byte myByte;
        myByte = 127;
        byte mybyte = -128;
        System.out.println(myByte);
        short myShort = 23438;

        // myShort.soutv
        System.out.println("myShort = " + myShort);
        int myInt = 1231312321;
        System.out.println("myInt = " + myInt);
        long myLong = 1234123123342343445L;

        float myFloat = 4.56f;
        double myDouble = 56.78;

        System.out.println("myDouble = " + myDouble);

        System.out.println("myFloat = " + myFloat);

        boolean isTrue = true;
        boolean isFalse = false;

        char myChar = '\uf54e';
        char myChar2 = 'g';
        System.out.println("myChar = " + myChar);

        String myName = "Alex";
        System.out.println("myName = " + myName);

        String lastName = new String("Komanov");
    }
}
