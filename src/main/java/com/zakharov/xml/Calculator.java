package com.zakharov.xml;

public class Calculator {
    private final MinusService minusService;
    private final PlusService plusService;

    public Calculator(MinusService minusService, PlusService plusService) {
        this.minusService = minusService;
        this.plusService = plusService;
    }

    public double calculate(double a, double b) {
        if (a > b) {
            return minusService.minus(a, b);
        }
        return plusService.plus(a, b);
    }
}
