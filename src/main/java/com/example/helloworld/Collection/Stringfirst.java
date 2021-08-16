package com.example.helloworld.Collection;


import java.util.Date;

public class Stringfirst {
    public static void main(String[] args) {
        long a=new Date().getTime();
        String cc="";
        int n=10000;
        for (int i = 0; i < n; i++) {
            cc+="."+i;
        }
        System.out.println("String使用的时间"+(System.currentTimeMillis()-a)/1000.0+"s");
        long s1=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("."+i);
        }
        System.out.println("StringBuilder使用的时间"+(System.currentTimeMillis()-s1)/1000.0+"s");
        long s2=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("."+i);
        }
        System.out.println("StringBuffer使用的时间"+(System.currentTimeMillis()-s2)/1000.0+"s");
    }

}
