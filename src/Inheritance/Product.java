package Inheritance;

public class Product {
    private String name;
    private String category;
    private double price;

    Product (String name , String category , double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    void displayDetails () {
        System.out.println("Name : " +name);
        System.out.println("Category : " +category);
        System.out.println("Price : " +price);
    }

    public String getName () {
        return name;
    }
}


class Electronic extends Product{
    private int warrantyPeriodInYears;
    private String brand;

    Electronic (String name , double price , int warrantyPeriodInYears , String brand) {
        super(name , "Electronics" , 100.00);
        this.warrantyPeriodInYears = warrantyPeriodInYears;
        this.brand = brand;
    }

    void displayDetails () {
        super.displayDetails();
        System.out.println("Warranty : "+ warrantyPeriodInYears);
        System.out.println("Brand : "+brand);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Default" , "Default Category" , 00.00);
        Electronic e1 = new Electronic("Laptop" , 100.00 , 10 , "HP");
        System.out.println(e1.getName());
        System.out.println(p1.getName());

        System.out.println();

        p1.displayDetails();
        System.out.println();
        e1.displayDetails();

    }
}