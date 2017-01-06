package com.ray.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ray.publisher.AfterInsertEventPublisher;
import com.ray.publisher.BeforeInsertEventPublisher;

@Component
public class MyAspect {

    @Autowired
    private BeforeInsertEventPublisher beforeInsertEventPublisher;

    @Autowired
    private AfterInsertEventPublisher afterInsertEventPublisher;

    /**
     * This is the method which I would like to execute before a selected method
     * execution.
     */
    public void beforeAdvice(JoinPoint jp) {
        beforeInsertEventPublisher.publish();
    }

    /**
     * This is the method which I would like to execute after a selected method
     * execution.
     */
    public void afterAdvice(JoinPoint jp) {
        afterInsertEventPublisher.publish();
    }

    public BeforeInsertEventPublisher getBeforeInsertEventPublisher() {
        return beforeInsertEventPublisher;
    }

    public void setBeforeInsertEventPublisher(BeforeInsertEventPublisher beforeInsertEventPublisher) {
        this.beforeInsertEventPublisher = beforeInsertEventPublisher;
    }

    public AfterInsertEventPublisher getAfterInsertEventPublisher() {
        return afterInsertEventPublisher;
    }

    public void setAfterInsertEventPublisher(AfterInsertEventPublisher afterInsertEventPublisher) {
        this.afterInsertEventPublisher = afterInsertEventPublisher;
    }

}
