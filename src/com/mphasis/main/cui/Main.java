package com.mphasis.main.cui;
class Point{
    int x;
    int y;
}
class Circle{
    public int getArea(){
        Point point=new Point();
        point.x=3;
        point.y=5;
        return point.x+point.y;
    }
}
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        int result = circle.getArea();
        System.out.println(result);

        System.out.println("end");

    }
}
