package com.cursor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Scheduler scheduler = applicationContext.getBean(Scheduler.class);
        scheduler.printTime();
    }
}
