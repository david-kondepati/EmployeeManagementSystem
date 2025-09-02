package com.ems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
    	ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfig.class);
    	Main m = container.getBean(Main.class);
    	m.crud();
    	
    }
}






