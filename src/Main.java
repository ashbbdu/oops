//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static class Employee {
      String name;
       int salary;

        public void setName (String _name) {
            this.name = _name;
        }

        public void setSalary(int _salary) {
            this.salary = _salary;
        }

        public void getSalary () {
            System.out.println(this.salary);
        }
    }

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
        Employee e1 = new Employee();
        e1.setName("Ashish");
        e1.setSalary(100);
       e1.getSalary();
       e1.setSalary(1000);
       e1.getSalary();


       Student s1 = new Student();
       s1.setDetails("Ashish" , 21);
       s1.displayDetails();
    }
}