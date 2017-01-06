package com.ray.event;

import org.springframework.context.ApplicationEvent;

public class AfterInsertEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public AfterInsertEvent(Object source) {
        super(source);
    }

}
