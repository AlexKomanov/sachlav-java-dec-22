package lesson_07.car;

public class MyCars {
    public static void main(String[] args) {

        System.out.println("Car.wasCreated = " + Car.wasCreated);
        Car bmw = new Car("red");
        bmw.carIsReady();
        Car.classOccurrences();
        System.out.println("bmw.color = " + bmw.color);
        bmw.color = "black";
        System.out.println("bmw.color = " + bmw.color);
        System.out.println("bmw.isElectrical = " + bmw.isElectrical);
        bmw.year = 2023;
        System.out.println("bmw.year = " + bmw.year);
        bmw.year = 223;
        System.out.println("bmw.year = " + bmw.year);

        // Create a first car
        bmw.year = 2023;
        bmw.color = "white";
        bmw.isElectrical = true;
        bmw.model = "model 7";
        bmw.manufacturer = "BMW";

         //Create a second car
        Car tesla = new Car();
        Car.classOccurrences();
        tesla.color = "white";
        tesla.year = 2022;

        System.out.println("tesla.manufacturer = " + tesla.manufacturer);

        Car car = new Car("dark blue", 2019, "ford", "mustang", false);
//        car.printCarInfo();
        System.out.println(car);
        Car.classOccurrences();




    }
}
