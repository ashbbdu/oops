package Inheritance;

public class Dog extends Animal{
    Dog () {
        super(10 , 2 , "Dog");
    }

    @Override
    public String sound () {
        return "Dog is barking";
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.sound());
        System.out.println(dog.getCreatureName());
        Dog priyanka = new Dog();
        System.out.println(priyanka.sound());

    }
}
