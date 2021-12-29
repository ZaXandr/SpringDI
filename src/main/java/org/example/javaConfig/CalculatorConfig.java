package org.example.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
    @Bean
    public PlusService2 plusService2() {
        PlusService2 plusService2 = new PlusService2();
        return plusService2;
    }

    @Bean
    public MinusService2 minusService2() {
        MinusService2 minusService2 = new MinusService2();
        return minusService2;
    }

    @Bean
    public Calculator2 calculator2(){
        Calculator2 calculator2 = new Calculator2(minusService2(),plusService2());
        return calculator2;
    }
}
