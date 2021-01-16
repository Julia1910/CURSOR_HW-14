package com.cursor;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Scheduler {

    @Scheduled(fixedRate = 1000)
    public void printTime() {
        System.out.println("Current time is " + new Date());
    }
}
