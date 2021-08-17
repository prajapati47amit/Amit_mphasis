package com.mphasis.main.cui;

import java.awt.*;
import java.util.*;

class Process{
    public Collection<String> getElements(){
        ArrayList<String> data = new ArrayList<String>();
        data.add("F");
        data.add("P");
        data.add("Q");
        data.add("R");
        return data;

    }
}
class Point{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Process process=new Process();
        /*List<String> res=process.getElements();
        System.out.println(res);
        for(String str:res)
            System.out.println(str);
        Iterator<String> iterator =res.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

         */
        /*Collection<String> res= process.getElements();
        if(res instanceof List){

            List<String> list =(List) res;
            ListIterator<String> listIterator= list.listIterator();
            while (listIterator.hasNext())
                System.out.println(listIterator.next());
            while(listIterator.hasPrevious())
                System.out.println(listIterator.previous());
        }
         */
        HashSet<Point> hashSet=new HashSet<Point>();
        hashSet.add(new Point(2,4));
        hashSet.add(new Point(2,4));
        hashSet.add(new Point(2,4));
        System.out.println(hashSet);
    }
}
