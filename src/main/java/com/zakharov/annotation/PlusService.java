package com.zakharov.annotation;

import org.springframework.stereotype.Component;

@Component
public class PlusService {
    public double plus(double a, double b) {
        return a + b;
    }
}