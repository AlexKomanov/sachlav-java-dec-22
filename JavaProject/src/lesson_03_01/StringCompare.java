package lesson_03_01;

public class StringCompare {
    public static void main(String[] args) {

        String firstString = "Alex";

        String secondString = "Sasha";

        String thirdString = "Alex";

        // creating new String object with the same value as firstString or thirdString

        String fourthString =  new String("Alex");

        System.out.println("Comparing strings using == operator \n");

        System.out.print("firstString == secondString : ");

        System.out.println(firstString == secondString);

    /*
     * Here firstString and thirdString is referring to the same String object
     * hence it will print 'true'.
     */

        System.out.print("firstString == thirdString : ");

        System.out.println(firstString == thirdString);


    /*
     * Here firstString and fourthString have same value,
     *  but they are referring to the different String object.
     * hence it will print 'false'
     */
        System.out.print("firstString == fourthString : ");

        System.out.println(firstString == fourthString);


    }
}
