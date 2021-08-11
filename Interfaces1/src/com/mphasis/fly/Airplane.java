package com.mphasis.fly;
import com.mphasis.fly.Flyer;

public class Airplane extends Vehicle implements Flyer{
    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void takeOff() {
        System.out.println("Takeoff");
    }

    @Override
    public void land() {
        System.out.println("land");
    }
}
