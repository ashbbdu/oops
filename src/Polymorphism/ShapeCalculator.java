package Polymorphism;

public class ShapeCalculator {
    public int area (int radius) {
        return (int) Math.PI * (radius * radius);
    }

    public int area (int length , int width) {
        return length * width;
    }
    public int area (int base1, int base2, int height) {
        return  ((base1 + base2) * height) / 2;
    }

    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Area of Circle : " + shapeCalculator.area(2));
        System.out.println("Area of Rectangle : " + shapeCalculator.area(2 , 3));
        System.out.println("Area of Trapezoid : " + shapeCalculator.area(2 , 3 , 2));
    }
}
