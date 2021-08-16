package com.example.helloworld.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @explain：监听ServletContent对象的创建和销毁
 * @date：2018/12/13
 */
public class MyservletListener implements ServletContextListener {
    /**
     * 对象创建
     * @param sce
     */
    public  void contextInitialized(ServletContextEvent sce) {
    }
    /**
     * 对象销毁
     * @param sce
     */
    public  void contextDestroyed(ServletContextEvent sce) {
    }

}

