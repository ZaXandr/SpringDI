package com.zakharov.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
    @Bean
    public PlusService plusService() {
        PlusService plusService = new PlusService();
        return plusService;
    }

    @Bean
    public MinusService minusService() {
        MinusService minusService = new MinusService();
        return minusService;
    }

    @Bean
    public Calculator calculator(){
        Calculator calculator = new Calculator(minusService(),plusService());
        return calculator;
    }
}
