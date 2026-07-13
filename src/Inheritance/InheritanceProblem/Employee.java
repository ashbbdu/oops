package Inheritance.InheritanceProblem;

public  class Employee {
    private Integer id;
    private String name;

    Employee (Integer id , String name) {
        this.id = id;
        this.name = name;
    }

    public void getDetails () {
        System.out.println("Employee Id : {}" + id);
        System.out.println("Employee Name : {}" + name);
    }

    public static void main(String[] args) {
        Manager m1  = new Manager(10 , "Ashish" , 30);
        m1.getDetails();


    }

}


