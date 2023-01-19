package lesson_09;

public class MyPersons {
    public static void main(String[] args) {

        Person person = new Person("Alex", "Komanov", 34, true);
        person.whatIsYourName();

        Student student = new Student("Alexander", "Komanov", 38, true, 30);

        student.whatIsYourName();


    }
}
