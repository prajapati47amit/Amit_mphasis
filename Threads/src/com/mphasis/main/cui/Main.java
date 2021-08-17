package com.mphasis.main.cui;

import java.util.logging.Level;
import java.util.logging.Logger;

class Task implements Runnable{
    private static final Logger logger;
    Thread firstThread;
    static{
        logger=Logger.getLogger(Task.class.getName());
    }
    @Override
    public void run() {
        Thread currThread=Thread.currentThread();
        if(currThread.getName().equals("Thread1")){
            firstThread=currThread;
        }
        if(currThread.getName().equals("Thread2")){
            if (firstThread!=null){
                try {
                    printInfo("$$$$$$$$$$$$$$$$$$$$$");
                    firstThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        for(int counter=0;counter<4;counter++)
            printInfo(currThread.toString()+counter);
    }
    private  static void printInfo(String message){
        logger.log(Level.INFO,message);
    }
}

public class Main {
    private static final Logger logger;

    static{
        logger=Logger.getLogger(Main.class.getName());
    }
    public static void main(String[] args) {
	// write your code here
        printInfo(String.valueOf(Runtime.getRuntime().availableProcessors()));
        Thread mainThread=Thread.currentThread();

        //printInfo(mainThread.toString());
        //printInfo(mainThread.getState().toString());

        Task task=new Task();
        Thread thread1= new Thread(task,"Thread1");
        Thread thread2= new Thread(task,"Thread2");

        printInfo(thread1.toString());
        printInfo(thread1.getState().toString());

        //thread1.setName("My First Thread");
        printInfo("thread1 is in ........>"+thread1.getState().toString()+" state ");
        thread1.start();
        thread2.start();

        printInfo("thread1 is in ........>"+thread1.getState().toString()+" state ");
        printInfo("thread2 is in ......> "+thread2.getState().toString()+" state");

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  try {
      //      Thread.sleep(1);
        //} catch (InterruptedException e) {
       //     e.printStackTrace();
       // }

        printInfo("thread1 is in ........>"+thread1.getState().toString()+" state ");
        printInfo("thread2 is in ......> "+thread2.getState().toString()+" state");

        printInfo("End");
    }
    private  static void printInfo(String message){
        logger.log(Level.INFO,message);
    }
}
