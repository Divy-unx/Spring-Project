package com.springframework.vehicles;

public class MyApp {
    static void main() {
        Vehicle vehicle = new Car();
        Vehicle vehicle1 = new Bus();// polymorphism
        String mileage = vehicle.getMileage();
        String mileage1 = vehicle1.getMileage();// callling method on vehicle
        System.out.println(mileage);
        System.out.println(mileage1);
    }
}
