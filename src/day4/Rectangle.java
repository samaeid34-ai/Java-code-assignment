package day4;

public class Rectangle {
    private double length;
    private double width;
    private int counter;
    public Rectangle(){
counter++;
    }

    public Rectangle(double length,double width){
        System.out.println("This is parameterized constructor");
        this.length=length;
//        this.width=width;
        setWidth(width);
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setLength(double length){
        this.length=length;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

   public double calculateArea(){
        return length*width;
    }

    public double calculatePerimeter(){
        return length*2+width*2;
    }
}
