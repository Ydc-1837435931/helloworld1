package com.example.helloworld.jvmstudy;

import org.apache.tomcat.util.net.jsse.JSSEUtil;

public class Interof {
    public static void main(String[] args) {
        Integer a= 1;
        Integer b= 2;
        Integer c= 3;
        Integer d= 3;
        Integer e= 321;
        Integer f= 321;
        Long g = 3l;
        long g1 = 3l;
        int f1 =3;
        Object o1 = g1;

        System.out.println(c==d);//T
        System.out.println(e==f);//F

        System.out.println(c==(a+b));//T
        System.out.println(c.equals(a+b));//T


        System.out.println(g.equals(a+b));//F
        System.out.println(d.equals(f1));//t
        System.out.println(g.equals(f1));//f
        System.out.println(g==(a+b));//t

    }
}
