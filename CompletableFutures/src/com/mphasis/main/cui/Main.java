package com.mphasis.main.cui;

import  java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Begin");
        //create().thenAccept(data-> print(data));
        //CompletableFuture<Integer> cFuture=create();
        CompletableFuture<Integer> cFuture=new CompletableFuture<>();
        process(cFuture);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cFuture.complete(3);
        System.out.println("END");
    }
    public static CompletableFuture<Integer> create(){
        System.out.println("Inside create: " + Thread.currentThread());
        return CompletableFuture.supplyAsync(()->compute());

    }
    public static int compute(){
        System.out.println("Inside compute: "+Thread.currentThread());
        return 2;
    }
    public static void print(Integer data){
        System.out.println("Print: "+Thread.currentThread());
        System.out.println(data);
    }
    public static void process(CompletableFuture<Integer> cFuture){
        cFuture.thenApply(data->data*2)
                .thenApply(data->data+2)
                .thenApply(data->data/0)
                .exceptionally(throwable -> handle(throwable))
                .thenAccept(data->print(data))
                .thenRun(()-> System.out.println("1"))
                .thenRun(()-> System.out.println("2"))
                .thenRun(()-> System.out.println("3"));
    }
    public static int handle(Throwable throwable){
        System.out.println("Error: "+throwable);
        return 2;
    }
}
