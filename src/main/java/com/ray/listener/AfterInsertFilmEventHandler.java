package com.ray.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.ray.event.AfterInsertEvent;

@Component
public class AfterInsertFilmEventHandler implements ApplicationListener<AfterInsertEvent> {

    @Override
    public void onApplicationEvent(AfterInsertEvent event) {
        System.out.println("After Insert Film Data");
    }
}
