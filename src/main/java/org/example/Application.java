package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");
        org.example.XML.Calculator calculator = (org.example.XML.Calculator) beanFactory.getBean("calculator");
        System.out.println(calculator.calculate(4, 3));

        ApplicationContext context = new AnnotationConfigApplicationContext("org/example/annotation");
        org.example.annotation.Calculator calculator1  =  context.getBean("calculator", org.example.annotation.Calculator.class);
        System.out.println(calculator1.calculate(3, 4));

        ApplicationContext context2 = new AnnotationConfigApplicationContext("org/example/javaConfig");
        org.example.javaConfig.Calculator calculator2 =  context2.getBean("calculator", org.example.javaConfig.Calculator.class);
        System.out.println(calculator2.calculate(3, 3));
    }
}
