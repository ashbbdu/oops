package Interface;

interface CarInterface {
    public void start ();
    public void numberOfGears();
    default public void airBags () {
        System.out.println("Car has 5 air bags");
    }
}

class ManualCar implements CarInterface {

    @Override
    public void start() {
        System.out.println("Manual Car is Starting...");
    }

    @Override
    public void numberOfGears() {
        System.out.println("Manual Car has 5 gears");
    }
}

public class Interface {
}
