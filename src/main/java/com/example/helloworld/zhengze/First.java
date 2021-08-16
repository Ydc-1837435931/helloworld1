package com.example.helloworld.zhengze;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args) throws IOException {
        String str = "";
        //正则表达式规则
        String allow = "1\\d{10}";
        //字节缓冲文件读取流
        BufferedInputStream br = new BufferedInputStream(
                new FileInputStream("D:\\12.txt"));
        //我们把一次性读取到的字符尽量阔大
        byte[] bytes = new byte[100000];
        int len;
        //开始读取
        while((len = br.read(bytes)) !=  -1){
            //字节数组转化为字符串
            str = new String(bytes,0,len);
            //导入自定义方法，进行查找匹配，并写入指定文件
            function(str,allow);
        }
    }
    private static void function(String str, String allow) throws IOException {
        //创建字符缓冲输出流，用来将读取到的电话号码写入指定文件
        BufferedWriter bo = new BufferedWriter(new FileWriter("D:\\13.txt"));
        //根据传入的正则表达式的规则，获得pattern对象
        Pattern pattern = Pattern.compile(allow);
        //根据传入的待查找的字符串，获取Matcher对象
        Matcher m = pattern.matcher(str);
        //用Matcher对象的find()方法去寻找适合规则的字符串
        while(m.find()){
            //当找到之后，用group方法获取
            String num = m.group();
            //写入文件
            bo.write(num);
            //另起一行
            bo.newLine();
            //刷新一下缓冲
            bo.flush();
        }
    }
}
