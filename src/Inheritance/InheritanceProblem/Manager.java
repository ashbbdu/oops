package Inheritance.InheritanceProblem;

public class Manager extends Employee {
    private Integer teamSize;

    Manager(Integer id, String name , Integer teamSize) {
        super(id, name);
        this.teamSize = teamSize;
    }

    @Override
    public void getDetails () {
        super.getDetails();
        System.out.println("Team Size : {}" + teamSize);
    }
}
