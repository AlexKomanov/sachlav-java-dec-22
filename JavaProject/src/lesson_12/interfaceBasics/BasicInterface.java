package lesson_12.interfaceBasics;

import lesson_07.car.Car;

public interface BasicInterface {

    String NAME = "alex";

//    public Car car; // triggers error

    // public and abstract by default
    void sayHello();

    static void printInfo() {
        System.out.println("Say Hello From Basic Interface");
    }

    default int printInfoDefault(int a, int b) {
        return sumNumber(5, 6);
    }

    private int sumNumber(int a, int b) {
        return a + b;
    }
}
