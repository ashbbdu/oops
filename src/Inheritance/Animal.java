package Inheritance;

public class Animal extends Creature {
    private Integer legs;
    private Integer ears;


    Animal (Integer legs , Integer ears , String creatureName) {
        super(creatureName);
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
