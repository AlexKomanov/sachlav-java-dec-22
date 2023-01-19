package lesson_09.classTask.vehicles;

public class Bus extends Vehicle {
    private long capacity;
    private String color;

    public Bus(String manufacturer, int year, long capacity, String color) {
        super(manufacturer, year);
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a bus " + getManufacturer());
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a bus");
    }
}
