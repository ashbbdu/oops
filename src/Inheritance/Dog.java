package Inheritance;

public class Dog extends Animal{
    Dog () {
        super(10 , 2);
    }

    @Override
    public String sound () {
        return "Dog is barking";
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.sound());

    }
}
