package com.mphasis.main.cui;

public class Main {

    public static void main(String[] args) {
        String string1=new String("First");
        String string2=new String("first");
        String string3="First";
        String string4="First";
        System.out.println(string1.equals(string2));
        System.out.println(string3==string4);
    }
}
