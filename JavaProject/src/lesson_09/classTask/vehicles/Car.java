package lesson_09.classTask.vehicles;

public class Car extends Vehicle{

    private boolean isElectrical;
    private String color;

    public Car(String manufacturer, int year, boolean isElectrical, String color) {
        super(manufacturer, year);
        this.isElectrical = isElectrical;
        this.color = color;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a car " + getManufacturer());
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a car");
    }
}