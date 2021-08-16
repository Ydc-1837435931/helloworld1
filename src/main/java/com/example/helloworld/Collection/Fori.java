package com.example.helloworld.Collection;

public class Fori {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int finalI = i+1;
            new Thread(()->{
                System.out.println(finalI);
            }).start();
        }
    }
}
