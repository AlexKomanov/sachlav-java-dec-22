package lesson_12.animals;

import lesson_12.animals.interfaces.IFly;

public class Bird extends Animal implements IFly {
    @Override
    public void howManyLegs() {
        System.out.println("I'm a bird - I have 2 legs");
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird - I'm flying");
    }
}
