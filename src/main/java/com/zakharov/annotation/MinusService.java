package com.zakharov.annotation;

import org.springframework.stereotype.Component;

@Component
public class MinusService {
    public double minus(double a, double b) {
        return a - b;
    }
}