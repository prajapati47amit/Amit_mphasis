package com.mphasis.main.cui;

public interface Flyer {
    void takeOff();
    void fly();
    void land();
    default legs(){

    }
}
