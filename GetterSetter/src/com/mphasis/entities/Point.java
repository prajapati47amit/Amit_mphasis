package com.mphasis.entities;

import java.util.Objects;

public class Point {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;

    @Override
    public boolean equals(Object target) {
        if(this == target)
            return true;
        if(target==null || getClass()!=target.getClass())
            return false;
        Point point =(Point) target;


        return x==point.x && y==point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
