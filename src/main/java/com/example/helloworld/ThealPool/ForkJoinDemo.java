package com.example.helloworld.ThealPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinDemo{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyTask myTask = new MyTask(0,100);
        ForkJoinPool threadpool = new ForkJoinPool();
        ForkJoinTask<Integer> forkJoinTask = threadpool.submit(myTask);
        System.out.println(forkJoinTask.get());
        threadpool.shutdown();
    }
}
