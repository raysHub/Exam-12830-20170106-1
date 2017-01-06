package com.ray.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.ray.event.BeforeInsertEvent;

@Component
public class BeforeInsertFilmEventHandler implements ApplicationListener<BeforeInsertEvent> {

    @Override
    public void onApplicationEvent(BeforeInsertEvent event) {
        System.out.println("Before Insert Film Data");
    }
}
