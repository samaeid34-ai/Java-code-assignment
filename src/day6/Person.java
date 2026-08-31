package day6;

public class Person {
    private int age;
    private String name;
    private String address;

    public Person(){
        System.out.println("I am Person Default Constructor");
    }

    public Person(String name){
        this.name = name;
        System.out.println("I am Person Parameterized Constructor");
    }

    public void setAge(int age) {
        this.age = age;
    }
}