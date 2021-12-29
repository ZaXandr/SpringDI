package org.example.javaConfig;

public class Calculator2 {
    private MinusService2 minusService2;
    private PlusService2 plusService2;

    public Calculator2(MinusService2 minusService2, PlusService2 plusService2) {
        this.minusService2 = minusService2;
        this.plusService2 = plusService2;
    }

    public double calculate(double a, double b) {
        if (a > b) {
            return minusService2.minus(a, b);
        }
        return plusService2.plus(a, b);
    }
}
