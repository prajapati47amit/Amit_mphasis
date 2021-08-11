package com.mphasis.main.cui;
/*
class Base{
    public Base(int num){

        }
        public void test(){
            System.out.println("Base Class Test");
        }
}
class Derived extends Base{
    Derived() {
        super(7);

    }

    @Override
    public void test() {
        super.test();
        System.out.println("Derived Class Test");
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        Derived derived = new Derived();
        derived.test();
e
    }
}
*/
class Box {
    double width;
    double height;
    double depth;
    Box(Box ob){

    }
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double len){
        width=depth=height=len;
    }
    double volume(){
        return width*depth*height;
    }
}