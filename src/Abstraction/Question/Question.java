package Abstraction.Question;


abstract class Animal {

    private String name;

    Animal (String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    abstract void makeSound ();

}

class Dog extends Animal {

    Dog (String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("The dog " + this.getName() + " says : Woof!");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("The cat " + this.getName()  + " says : Meow!");
    }
}

public class Question {
    public static void main(String[] args) {

    }
}
