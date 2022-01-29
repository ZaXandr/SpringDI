package com.zakharov;

import com.zakharov.javaConfig.Calculator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");
        com.zakharov.XML.Calculator calculator = (com.zakharov.XML.Calculator) beanFactory.getBean("calculator");
        System.out.println(calculator.calculate(4, 3));

        ApplicationContext context = new AnnotationConfigApplicationContext("com/zakharov/annotation");
        com.zakharov.annotation.Calculator calculator1  =  context.getBean("calculator", com.zakharov.annotation.Calculator.class);
        System.out.println(calculator1.calculate(3, 4));

        ApplicationContext context2 = new AnnotationConfigApplicationContext("com/zakharov/javaConfig");
        Calculator calculator2 =  context2.getBean("calculator", Calculator.class);
        System.out.println(calculator2.calculate(3, 3));
    }
}
