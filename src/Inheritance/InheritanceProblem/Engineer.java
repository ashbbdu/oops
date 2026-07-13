package Inheritance.InheritanceProblem;

public class Engineer extends Employee {
    private String specialization;

    Engineer (Integer id , String name , String specialization) {
        super(id , name);
        this.specialization = specialization;
    }

    @Override
    public void getDetails () {
        super.getDetails();
        System.out.println("Specialization {}" + specialization);
    }
}
