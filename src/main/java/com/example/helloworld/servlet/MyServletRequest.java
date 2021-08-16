package com.example.helloworld.servlet;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @explain：ServletRequest对象的创建和销毁监听
 * @author：jimmy
 * @date：2018/12/13
 * @create by Intellij Idea
 */
public class MyServletRequest implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent sre) {
    }

    public void requestInitialized(ServletRequestEvent sre) {
    }
}

