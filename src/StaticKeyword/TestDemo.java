package StaticKeyword;

class Demo  {
    static int doSomething () {
        System.out.println("Do something triggered");
        return 1;
//        return sum(10 , 20); // Non-static method 'sum(int, int)' cannot be referenced from a static context
    }
    int sum (int a , int b ) {
        System.out.println(doSomething()); // yes a static method can ve used from a non-static method
        return a + b;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.sum(1 , 2));
    }
}
