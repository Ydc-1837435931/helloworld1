package com.example.helloworld.jvmstudy;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemphoreDemo {
    public static void main(String[] args) {
        /*Semphore定义了资源数 控制了资源
        并发控制 semphore的acquire方法资源减一
        而release是加一
        * */
        Semaphore semaphore = new Semaphore(6);
        for (int i = 1; i <= 16; i++) {
            new Thread(()->{
                try{
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"\t抢到了资源");
                    try{
                        TimeUnit.SECONDS.sleep(3);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"\t离开了车位");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            }).start();
        }
    }
}
