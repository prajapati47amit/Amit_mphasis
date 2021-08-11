package com.mphasis.fly;

public class SeaPlane extends Airplane implements Sailer{

    @Override
    public void dock() {
        System.out.println("dock from Seaplane");
    }

    @Override
    public void cruise() {
        System.out.println("cruise from Seaplane");
    }
}
