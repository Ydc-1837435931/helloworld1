package com.example.helloworld.servlet;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @explain：HttpSeesion对象的创建和销毁监听
 * @date：2018/12/13
 * @create by Intellij Idea
 */
public class MyHttpServletListener implements HttpSessionListener {


    /**
     * 对象创建
     * @param sessionEvent
     */
    @Override
    public void  sessionCreated(HttpSessionEvent sessionEvent){

    }
    /**
     * 对象销毁
     * @param sessionEvent
     */
    @Override
    public  void sessionDestroyed(HttpSessionEvent sessionEvent){

    }
}
