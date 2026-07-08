package Inheritance;

public class Creature {
    private String creatureName;

    Creature (String creatureName) {
        this.creatureName = creatureName;
    }

    public void setCreatureName (String creatureName) {
        this.creatureName = creatureName;
    }

    public String getCreatureName () {
        return creatureName;
    }
}
