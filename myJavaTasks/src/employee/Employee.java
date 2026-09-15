package employee;

public class Employee {
    private String name;
    private double baseSalary;

    Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculateBonus(){
        return 0.0;
    }
    public String getPaySlip(){
        double calculated = calculateBonus();
        return name + ": Base ₦" + baseSalary + ", Bonus ₦"+ calculated + ", Total ₦" + (calculated + baseSalary);
    }
}
class Developer extends Employee{
    private int projectsCompleted;

    Developer(String name, double baseSalary, int projectsCompleted) {
        super(name, baseSalary);
        this.projectsCompleted = projectsCompleted;
    }

    public double calculateBonus(){
        return projectsCompleted * 5000;
    }
}
class Manager extends Employee{
    private int teamSize;

    Manager(String name, int baseSalary, int teamSize){
        super(name, baseSalary);
        this.teamSize = teamSize;
    }
    public double calculateBonus(){
        return teamSize * 2000;
    }
}
