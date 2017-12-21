//package com.itmuch.learn.user;
//
//import org.springframework.boot.actuate.health.Health;
//import org.springframework.boot.actuate.health.HealthIndicator;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.atomic.AtomicInteger;
//
//@Component
//public class MyHealthIndicator implements HealthIndicator {
//
//    private AtomicInteger integer = new AtomicInteger();
//
//    @Override
//    public Health health() {
//        int i = integer.incrementAndGet();
//
////        if (i % 3 == 0) {
//            return Health.up().build();
////        }
////        return Health.up().build();
//    }
//}
