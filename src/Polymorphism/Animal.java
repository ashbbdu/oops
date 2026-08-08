package Polymorphism;

class Dog extends Animal {
    @Override
    public void sound () {
        System.out.println("Dog is barking...");
    }
}

public class Animal {
    public void sound () {
        System.out.println("Default Animal Sound");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
