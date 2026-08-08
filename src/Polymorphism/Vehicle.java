package Polymorphism;


class Car extends Vehicle {
    public static void sound () {
        System.out.println("Car sound");
    }
}

public class Vehicle {
    public static void sound () {
        System.out.println("Vehicle Default Sound !");
    }

    public static void main(String[] args) {
        Vehicle.sound();
        Car.sound();
    }
}
