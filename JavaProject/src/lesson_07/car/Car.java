package lesson_07.car;

public class Car {

    String color;
    int year;
    String manufacturer;
    String model;
    boolean isElectrical;

    int created = 0;
    static int wasCreated = 0;

    public Car() {
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public Car(String color) {
        this.color = color;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public Car(int year, String manufacturer) {
        this.year = year;
        this.manufacturer = manufacturer;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public Car(String color, int year, String manufacturer, String model, boolean isElectrical) {
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.isElectrical = isElectrical;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public void carIsReady() {
        System.out.println("I'm ready!");
    }

    public void printCarInfo() {
        System.out.println(this);  // this.toString()
    }

    public static void classOccurrences() {
        System.out.println("wasCreated = " + wasCreated);
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", isElectrical=" + isElectrical +
                '}';
    }
}
