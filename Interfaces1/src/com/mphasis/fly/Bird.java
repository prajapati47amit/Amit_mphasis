package com.mphasis.fly;

public class Bird extends Animal implements Flyer{
    @Override
    public void takeOff() {
        System.out.println("Bird's takeoff");
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
    public void buildNest(){

    }
    public void layEggs(){

    }
}
