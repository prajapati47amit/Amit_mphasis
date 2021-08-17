package com.mphasis.main.cui;

import java.util.logging.Level;
import java.util.logging.Logger;

class Data{
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;
}




class Task implements Runnable {
    private static final Logger logger;
    private int counter;
    Thread producer,consumer;
    Data data;

    static {
        logger = Logger.getLogger(Task.class.getName());
    }

    Task() {
        producer=new Thread(this,"Producer");
        consumer=new Thread(this,"Consumer");
        data = new Data();
    }

    @Override
    public void run() {
        Thread currThread = Thread.currentThread();
        for (counter = 0; counter < 4; counter++) {
            if (currThread.getName().equals("Producer")) {
                printInfo(currThread.toString());
                if (consumer!=null && !consumer.IsAlive()){
                    consumer.start();
                }
                synchronized (data) {
                    //printInfo(currThread.toString());
                    data.setValue(counter);
                    try {
                        data.wait(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    printInfo(currThread.toString());
                }
            } else if (currThread.getName().equals("Consumer")) {
                synchronized (data) {

                    //data.getValue();
                    printInfo(currThread + String.valueOf(data.getValue()));
                    try {
                        data.notify();
                        data.wait(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
    private static void printInfo (String message){
            logger.log(Level.INFO, message);

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
        //Task task2=new Task();

        Thread thread1= new Thread(task,"Producer");
        Thread thread2= new Thread(task,"Consumer");

        //printInfo(thread1.toString());
        //printInfo(thread1.getState().toString());

        //thread1.setName("My First Thread");
        //printInfo("thread1 is in ........>"+thread1.getState().toString()+" state ");
        thread1.start();
        thread2.start();

        //printInfo("thread1 is in ........>"+thread1.getState().toString()+" state ");
        //printInfo("thread2 is in ......> "+thread2.getState().toString()+" state");


        //  try {
        //      Thread.sleep(1);
        //} catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        //printInfo("thread1 is in ........>"+thread1.getState().toString()+" state ");
        //printInfo("thread2 is in ......> "+thread2.getState().toString()+" state");

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        printInfo("End");
    }
    private  static void printInfo(String message){
        logger.log(Level.INFO,message);
    }
}
