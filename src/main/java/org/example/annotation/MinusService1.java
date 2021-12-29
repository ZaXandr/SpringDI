package org.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class MinusService1 {
    public double minus(double a, double b) {
        return a - b;
    }
}