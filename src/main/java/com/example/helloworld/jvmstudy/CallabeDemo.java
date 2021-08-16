package com.example.helloworld.jvmstudy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


/*多线程中，第三种获得多线程的方式*/
public class CallabeDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new Mythread());

        new Thread(futureTask,"A").start();
        System.out.println(futureTask.get());
    }
}
class Mythread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("*********come  in here");
        return 1024;
    }
}
