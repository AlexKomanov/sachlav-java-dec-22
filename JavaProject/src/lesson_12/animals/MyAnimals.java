package lesson_12.animals;

import lesson_12.animals.interfaces.Breathable;

import java.util.ArrayList;
import java.util.List;

public class MyAnimals{
    public static void main(String[] args) {

        List<Breathable> list = new ArrayList<>();

        Breathable dogInterface = new Dog();
        Dog dog = new Dog();
        Animal dogAnimal = new Dog();

        list.add(dogInterface);
        list.add(new Bird());
        list.add(new Snake());

        list.forEach(animal -> animal.breathe(5));
    }
}
