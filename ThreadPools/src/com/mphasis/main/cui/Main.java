package com.mphasis.main.cui;

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Task implements Runnable{
    private static final Logger logger;
    static {
        logger= Logger.getLogger(Task.class.getName());
    }

    @Override
    public void run() {
        logger.log(Level.INFO,"Task Started");
        //logger.log(Level.INFO,Thread.currentThread().toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.log(Level.INFO,"Task Ended");
    }
}

public class Main {
    private static final Logger logger;
    static {
        logger= Logger.getLogger(Main.class.getName());
    }

    public static void main(String[] args) {
	// write your code here
        int vCPU=Runtime.getRuntime().availableProcessors();
        //ExecutorService executorService= Executors.newFixedThreadPool(vCPU);
        //ExecutorService executorService= Executors.newCachedThreadPool();
        //ScheduledExecutorService service= Executors.newScheduledThreadPool(vCPU);
        logger.log(Level.INFO,"Begin");
        //for (int counter=0; counter<1;counter++){
            //service.schedule(new Task(),10, TimeUnit.SECONDS);
        //}
        ExecutorService service= new ThreadPoolExecutor(10,100,30,TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        service.execute(new Task());
        //service.scheduleAtFixedRate(new Task(),5,3, TimeUnit.SECONDS);
        //service.scheduleWithFixedDelay(new Task(),5,10, TimeUnit.SECONDS);
        logger.log(Level.INFO,"Submitted");
        //executorService.awaitTermination(1000);
       // service.shutdown()
    }
}
