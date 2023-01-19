package lesson_09.classTask.vehicles;

public abstract class Vehicle {

    private String manufacturer;
    private int year;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void sayHello() {
        System.out.println("I'm just a vehicle");
    }

    public abstract void whoAreYou();
}
