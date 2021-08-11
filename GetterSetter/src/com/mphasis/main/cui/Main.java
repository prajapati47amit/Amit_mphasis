package com.mphasis.main.cui;
import com.mphasis.entities.Point;

public class Main {

    public static void main(String[] args) {
	    Point point1 = new Point();
	    Point point2 = new Point();
	    point1.setX(4);
	    point1.setY(3);
	    point2.setX(point1.getX());
	    point2.setY(point1.getY());
		System.out.println(point1);
		System.out.println(point2);
	    System.out.println(point1.equals(point2));
    }
}
