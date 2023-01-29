package lesson_12.animals;

public class Snake extends Animal {
    @Override
    public void howManyLegs() {
        System.out.println("I'm a snake - I have no legs...");
    }

    @Override
    public void breathe(int amountOfOxygen) {
        System.out.println("I'm a snake. I breathe " + amountOfOxygen);
    }
}
