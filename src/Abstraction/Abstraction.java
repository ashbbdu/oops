package Abstraction;

//class Car {
//    void greet () {
//        System.out.println("hii");
//    }
//}

abstract class Car {
    abstract void start();
    abstract void airbag();
    void noise () {
        System.out.println("Noise.....");
    };
}

class ManualCar extends Car {

    @Override
    void start() {
        System.out.println("Manual car is starting...");
    }

    @Override
    void airbag() {
        System.out.println("Manual car airbag");
    }
}

class AutomaticCar extends  Car {

    @Override
    void start() {
        System.out.println("Automatic car is starting...");
    }

    @Override
    void airbag() {
        System.out.println("Automatic car airbag");
    }
}


//Abstraction using interface

interface CarInterface {
    public void noise ();
    //    after Java 8 we have default and static so , we can now have implemented methods in an interface
    default public void start () {
        System.out.println("Car Interface car is starting");
    }

    static public void numberOfWheels () {
        System.out.println("Wheels : 4");
    }
}

class InterfaceCar implements CarInterface {

    @Override
    public void noise() {
        System.out.println("Car is making sound : From Interface");
    }


}

class InterFaceCar1  implements CarInterface {

    @Override
    public void noise() {

    }

    @Override
    public void start() {
//        CarInterface.super.start();
        System.out.println("InterFaceCar1 is starting");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car manualCar = new ManualCar();
        Car automaticCar = new AutomaticCar();
        manualCar.start();
        manualCar.noise();
        System.out.println();

        automaticCar.start();
        automaticCar.noise();

        System.out.println();
        InterfaceCar interfaceCar = new InterfaceCar();
        interfaceCar.noise();
        interfaceCar.start();

        CarInterface.numberOfWheels();

        System.out.println();

        InterFaceCar1 a1 = new InterFaceCar1();
        a1.start();

    }
}
