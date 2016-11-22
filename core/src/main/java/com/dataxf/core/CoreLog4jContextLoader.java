package com.dataxf.core;

import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.net.URL;

public class CoreLog4jContextLoader implements ServletContextListener {
    public static final String CONFIG_LOCATION_PARAM = "log4jConfigLocation";
    public static final String CLASSPATH_URL_PREFIX = "classpath:";
    public static final String XML_FILE_EXTENSION = ".xml";

    public CoreLog4jContextLoader(){
    }

    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        String location = servletContext.getInitParameter(CONFIG_LOCATION_PARAM);

        URL url = Thread.currentThread().getContextClassLoader().getResource(location.substring(CLASSPATH_URL_PREFIX.length()));

        if (location.toLowerCase().endsWith(XML_FILE_EXTENSION)) {
            DOMConfigurator.configure(url);
        }
        else {
            PropertyConfigurator.configure(url);
        }
    }

    public void contextDestroyed(ServletContextEvent event) {
        LogManager.shutdown();
    }
}
