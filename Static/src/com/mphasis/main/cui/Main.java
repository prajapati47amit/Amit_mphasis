package com.mphasis.main.cui;

import javax.swing.*;

class Test{
    static int value;
}
class Outer{
    static class Inner{
        int value;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Test.value=51;
        System.out.println(Test.value);
        //JOptionPane.showMessageDialog(null,"Shri","Greetings", JOptionPane.WARNING_MESSAGE);
        Outer.Inner outerInner=new Outer.Inner();
        outerInner.value=10;
    }
}
