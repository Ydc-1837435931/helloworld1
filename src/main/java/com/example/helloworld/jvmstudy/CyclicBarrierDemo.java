package com.example.helloworld.jvmstudy;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("**********召唤神龙");
        });

        for (int i = 0; i < 11; i++) {
            final int temInt = i;
            new Thread(
                    ()->{
                        System.out.println(Thread.currentThread().getName()+"\t收集到第"+temInt+"颗龙珠");
                        try{
                            cyclicBarrier.await();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }catch (BrokenBarrierException e){
                            e.printStackTrace();
                        }
                    }

            ).start();
        }
    }
}
