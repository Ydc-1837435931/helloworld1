package com.example.helloworld.zhujie;

import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) {
        try{
            //首先获取Class
            Class stuClass = Class.forName("com.example.helloworld.zhujie.Student");
            //再获取类中的方法
            Method stuMethod = stuClass.getMethod("study",int.class);
            //判断方法是否被注释
            if (stuMethod.isAnnotationPresent(CherryAnnotation.class)){
                System.out.println("Student这个类被注解了");
                //注解获取这个实体类，从而获取到其属性值
                CherryAnnotation cherryAnnotation = stuMethod.getAnnotation(CherryAnnotation.class);
                System.out.println(cherryAnnotation.name()+cherryAnnotation.age()+cherryAnnotation.score());
            }else {
                System.out.println("Student这个类未被注解");
            }
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
