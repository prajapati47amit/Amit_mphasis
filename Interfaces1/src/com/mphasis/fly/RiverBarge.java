package com.mphasis.fly;

public class RiverBarge implements Sailer{


    @Override
    public void dock() {
        System.out.println("dock from River Barge");
    }

    @Override
    public void cruise() {
        System.out.println("cruise from River Barge");
    }
}
