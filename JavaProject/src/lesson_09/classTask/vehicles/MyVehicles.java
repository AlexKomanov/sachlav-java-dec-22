package lesson_09.classTask.vehicles;

import java.util.ArrayList;
import java.util.List;

public class MyVehicles {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car("BMW", 2023, false, "black");


        vehicles.add(new Truck("Tesla", 2024, "full", "white"));
        vehicles.add(new Bus("MAN", 2020, 1566L, "green"));
        vehicles.add(car);

        vehicles.forEach(item -> {
            item.sayHello();
            item.whoAreYou();
        });

    }
}
