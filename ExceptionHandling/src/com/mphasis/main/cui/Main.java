package com.mphasis.main.cui;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

class IllegalAgeException extends Exception{
    public String getMessage(){
        return "You have to be adult first to register for voting";
    }
}

class Voter{
    public void register(int age) throws IllegalAgeException{
        if(age <18){
            throw new IllegalAgeException();
        }
    }
}
class Test{
    public void testing() throws IllegalAgeException {
        new Voter().register(15);
    }
}
class Base{

}
class Derived{

}

public class Main {
    private static final Logger logger;
    static {
        logger= Logger.getLogger(Main.class.getName());
    }
    public static void main(String[] args) {
	// write your code here
        logger.log(Level.INFO,"Begin");
        int first=0;
        int second=0;
        Airthmatic airthmetic=new Airthmatic();
        int result=airthmetic.sum(2,4);
        assert 7==result: "Galat h";

        /*try {
            new Test().testing();
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        try {
             first=Integer.parseInt(args[0]);
             second=Integer.parseInt(args[1]);
            System.out.println("Hello");

        }
        catch (ArrayIndexOutOfBoundsException exception) {
                logger.log(Level.SEVERE,"java -classpath ");
                try{
                    System.out.println(first / second);
                }
                catch(ArrayIndexOutOfBoundsException exception1){
                    logger.log(Level.SEVERE,"inner catch");
                }
            }
        catch (NumberFormatException exception) {
            logger.log(Level.SEVERE,"NumberFormatExcption H Ye "+exception);
        }
        catch(Exception exception){
            logger.log(Level.SEVERE,"unknown error "+exception);
        }
        finally {
            logger.log(Level.INFO, "End");
        }*/

        }
    }

