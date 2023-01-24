package lesson_11.defaultPackage;

public class DefaultMain {
    public static void main(String[] args) {

        DefaultClass defaultClass = new DefaultClass();
        System.out.println("defaultClass.name = " + defaultClass.name);
        defaultClass.name = "Alexander";
        System.out.println("defaultClass.name = " + defaultClass.name);
    }
}
