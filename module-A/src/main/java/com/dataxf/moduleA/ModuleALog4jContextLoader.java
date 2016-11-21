package com.dataxf.moduleA;

import org.springframework.web.util.Log4jWebConfigurer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ModuleALog4jContextLoader implements ServletContextListener {

    public ModuleALog4jContextLoader(){
    }

    public void contextInitialized(ServletContextEvent event) {
        Log4jWebConfigurer.initLogging(event.getServletContext());
    }

    public void contextDestroyed(ServletContextEvent event) {
        Log4jWebConfigurer.shutdownLogging(event.getServletContext());
    }
}
