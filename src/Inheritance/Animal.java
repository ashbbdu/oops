package Inheritance;

public class Animal {
    private Integer legs;
    private Integer ears;

    Animal (Integer legs , Integer ears) {
        this.ears = ears;
        this.legs = legs;
    }

    public Integer getLegs () {
        return legs;
    }

    public void setLegs (Integer legs) {
        this.legs = legs;
    }

    public String sound () {
        return "Animal has some sound !";
    }
}
