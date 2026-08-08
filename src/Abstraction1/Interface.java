package Abstraction1;

interface CarInterface {
    public void start ();

//    earlier in Java , Interface abstract methods cannot have body , but now we can have a body using default keyword
     default public void noise () {
         System.out.println("Car Interface Noise...");
    }

    public static void numberOfWheels () {
        System.out.println("Total number of wheels : 4");
    }
}

class Car1 implements CarInterface {

    @Override
    public void start() {
        System.out.println("Car 1 is making sound");
    }

    @Override
    public void noise() {
        CarInterface.super.noise();
//        CarInterface.numberOfWheels();
//        System.out.println("Hii");
    }
}



public class Interface {
    public static void main(String[] args) {
        CarInterface car1 = new Car1();
        car1.start();
        car1.noise();
        CarInterface.numberOfWheels();
    }
}
