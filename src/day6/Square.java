package day6;

import day4.Rectangle;
public class Square extends Rectangle {
    @Override
    public double calculatePerimeter() {
        return length*4;
    }
}
