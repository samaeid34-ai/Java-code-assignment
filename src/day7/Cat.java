package day7;

public class Cat extends Dog{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

    public void scratch(){
        System.out.println("I am a cat , I scratch");
    }

}
