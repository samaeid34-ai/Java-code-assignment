package day6;

public class Employee extends Person {
    private int salary;
    private int id;
    private String department;

    public Employee(){
//super("Ahmed");
super();
        System.out.println("I am Employee Default Constructor");
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}