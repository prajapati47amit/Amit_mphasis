package com.mphasis.main.cui;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Flyer flyer = new Seaplane();
        flyer.fly();
        Sailor sailor = (Sailor) flyer;
        sailor.sail();
    }
}
