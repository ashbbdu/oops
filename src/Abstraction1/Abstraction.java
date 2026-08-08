package Abstraction1;



 abstract class Car {
    public abstract void start(); // hiding the implementation of start but also exposing noise
    public void noise () {
        System.out.println("Car is making sound");
    }

    abstract public void ensureAirBags ();
}

class ManualCar extends Car {
    @Override
    public void start() {
        System.out.println("Manual car is starting...");
    }

    @Override
    public void ensureAirBags() {

    }
}

class AutomaticCar extends Car {

    @Override
    public void start() {
        System.out.println("Automatic car is starting...");
    }

    @Override
    public void ensureAirBags() {

    }
}

public class Abstraction {
    public static void main(String[] args) {
        ManualCar manualCar = new ManualCar();
//        or
//        Car manualCar = new ManualCar(); // this should be prioritized
        manualCar.start();

        Car automaticCar = new AutomaticCar();
        automaticCar.start();
    }

}
