package org.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class PlusService1 {

    public double plus(double a, double b) {
        return a + b;
    }
}