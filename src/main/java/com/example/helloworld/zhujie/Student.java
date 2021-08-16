package com.example.helloworld.zhujie;

public class Student {
    @CherryAnnotation(name = "paidaxing",age = 19,score = {18,12,45})
    public void study(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("好好学习，天天向上");
        }
    }
}
