package com.example.helloworld.exception;

public class IllegalAgeException extends Exception{
    //默认构造器
    public IllegalAgeException() {

    }
    //带有详细信息的构造器，信息存储在message中
    public IllegalAgeException(String message) {
        super(message);
    }
}
