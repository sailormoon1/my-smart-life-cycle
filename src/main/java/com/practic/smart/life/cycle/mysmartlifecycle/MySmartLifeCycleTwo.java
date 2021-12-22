package com.practic.smart.life.cycle.mysmartlifecycle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class MySmartLifeCycleTwo implements SmartLifecycle {
    @Override
    public void start() {
        System.out.println("-------------11111天气开始变清凉了----------------");
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getPhase() {
        return 1;
    }
}
