package Abstraction;


// Can one abstract class extent another abstract class ?
//abstract class Car1 {
//    abstract public void start ();
//}
//
//abstract class Dealer extends Car1 {
//    int numberOfCars;
////   when abstract class is extending another abstract class then method from Parent class is not compulsory
//
//    @Override
//    public void start () {
//        System.out.println("Starting...");
//    }
//
//
//}
//
//class ManualCar1 extends Car1 {
//
//    @Override
//    public void start() {
//        System.out.println("Manual car is starting...");
//    }
//}

abstract class Car1 {
    Car1 () {
        System.out.println("Car1 constructor called");
    }
    abstract public void start ();
}

abstract class Dealer extends Car1 {
    private int numberOfCars;
//   when abstract class is extending another abstract class then method from Parent class is not compulsory

    Dealer () {
        System.out.println("Dealer constructor called");
    }

    Dealer (int numberOfCars) {
        this.numberOfCars = numberOfCars;
        System.out.println("Dealer param constructor called");
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    abstract public void isItOpen ();
    @Override
    public void start () {
        System.out.println("Starting...");
    }


}

class ManualCar1 extends Dealer {

    ManualCar1 (int numberOfCars) {
        super(numberOfCars);
        System.out.println("Manual Car 1 constructor called");
    }

    @Override
    public void isItOpen() {
        System.out.println("Yes it is open");
    }

    @Override
    public void start() {
        System.out.println("Manual car is starting...");
    }
}






public class Abstraction1 {
    public static void main(String[] args) {
        // Can we create a Constructor of an abstract class => no we can not => 'Car1' is abstract; cannot be instantiated
//        we can create the  Constructor but , we can not instantiate by using new keyword we can instantiate using super()
//        Car1 car1 = new Car1();

        ManualCar1 manualCar1 = new ManualCar1(12);
        System.out.println(manualCar1.getNumberOfCars());
    }
}
