package org.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class Calculator1 {
    private MinusService1 minusService1;
    private PlusService1 plusService1;

    public Calculator1(MinusService1 minusService1, PlusService1 plusService1) {
        this.minusService1 = minusService1;
        this.plusService1 = plusService1;
    }

    public double calculate(double a, double b) {
        if (a > b) {
            return minusService1.minus(a, b);
        }
        return plusService1.plus(a, b);
    }
}