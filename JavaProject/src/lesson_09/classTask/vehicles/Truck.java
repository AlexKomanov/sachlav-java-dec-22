package lesson_09.classTask.vehicles;

public class Truck extends Vehicle{

    private String type;
    private String color;

    public Truck(String manufacturer, int year, String type, String color) {
        super(manufacturer, year);
        this.type = type;
        this.color = color;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a truck " + getManufacturer());
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a truck");
    }
}
