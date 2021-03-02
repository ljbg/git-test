package com.lijunbo.listener;

import com.lijunbo.domain.Types;
import com.lijunbo.service.TypeService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.List;

@WebListener()
public class InitListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {


    public InitListener() {
    }


    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("这个是创建！#￥%……&*&……%￥#￥%……&*");
        //缓存商品类型
        TypeService typeService = new TypeService();
        List<Types> typeList;
        typeList = typeService.findAll();

        //获得容器对象,所有用户随时可以从这个容器中获取商品类型。
        ServletContext application = sce.getServletContext();
        application.setAttribute("typeList", typeList);
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }


    public void sessionCreated(HttpSessionEvent se) {

    }

    public void sessionDestroyed(HttpSessionEvent se) {

    }



    public void attributeAdded(HttpSessionBindingEvent sbe) {

    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {

    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {

    }
}
