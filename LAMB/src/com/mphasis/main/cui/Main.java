package com.mphasis.main.cui;

import java.util.logging.Level;
import java.util.logging.Logger;

interface Printer{
    public void print(String str);
}

interface Transformer{
    public int transform(String str);
}
public class Main {

    public static void main(String[] args) {
	// write your code here
       /* new ConClass(){
            @Override
            void test() {
                super.test();
                System.out.println("test in subclass of ConClass");
            }
        }.test();
        new AbsClass(){
            @Override
            void test() {
                super.test();
                System.out.println("Test in subclass of AbsClass");
            }
        };
        new Interface1(){
            @Override
            public void test() {
                System.out.println("Test in implementation of Interface");
            }
        };*/

        Printer printer1=(str)->System.out.println(str);
        printer1.print("Mphasis");
        printing((str)-> System.out.println(str),"Bangalore");

        Printer printer3=System.out::println;
        printer3.print("India");

        printing(System.out::println,"Rajasthan");

        Printer printer4=(str)-> Logger.getLogger(Main.class.getName()).log(Level.INFO,str);
        printer4.print("341303");

        Transformer transformer = (text) ->Integer.valueOf(text);
        System.out.println(transformer.transform("11"));

        Logging logger=(level,msg)->Logger.getLogger(Main.class.getName())




        new Thread(()-> System.out.println(Thread.currentThread())).start();


    }
    private static void printing(Printer printer, String text){
        printer.print(text);
    }
}
