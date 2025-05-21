//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Employee {
    public String name;
    private int salary;


//    constructor
    public Employee (String _name , int _salary) {
        this.name = _name;
        this.salary = _salary;
    }

    public void setName (String _name) {
        this.name = _name;
    }

    public void getName () {
        System.out.println(this.name);
    }

    public void setSalary(int _salary) {
        this.salary = _salary;
    }

    public void getSalary () {
        System.out.println(this.salary);
    }
}

public class Main {



    public static  class Student {
        String name;
        int rollNumber;

        public  void setDetails (String _name , int _rollNumber) {
            this.name = _name;
            this.rollNumber = _rollNumber;
        }

        public void displayDetails () {
            System.out.println(this.name);
            System.out.println(this.rollNumber);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Madhur" , 300);
        e1.getSalary();
        e1.getName();
//        e1.setName("Ashish");
//        e1.setSalary(100);
//       e1.getSalary();
//       e1.setSalary(1000);
//       e1.getSalary();


//       Student s1 = new Student();
//       s1.setDetails("Ashish" , 21);
//       s1.displayDetails();
//        System.out.println( s1.name);
//        System.out.println(s1.rollNumber);
    }
}