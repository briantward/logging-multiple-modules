package com.dataxf.moduleB;

import org.apache.log4j.xml.Log4jEntityResolver;
import org.springframework.util.Log4jConfigurer;
import org.springframework.web.util.Log4jConfigListener;
import org.springframework.web.util.Log4jWebConfigurer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ModuleBLog4jContextLoader extends Log4jEntityResolver implements ServletContextListener {

    public ModuleBLog4jContextLoader(){
    }

    public void contextInitialized(ServletContextEvent event) {
        Log4jWebConfigurer.initLogging(event.getServletContext());
    }

    public void contextDestroyed(ServletContextEvent event) {
        Log4jWebConfigurer.shutdownLogging(event.getServletContext());
    }
}
