package org.example;

import org.example.XML.Calculator;
import org.example.annotation.Calculator1;
import org.example.javaConfig.Calculator2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");
        Calculator calculator = (Calculator) beanFactory.getBean("calculator");
        System.out.println(calculator.calculate(4, 3));

        ApplicationContext context = new AnnotationConfigApplicationContext("org/example/annotation");
        Calculator1 calculator1  =  context.getBean("calculator1",Calculator1.class);
        System.out.println(calculator1.calculate(3, 4));

        ApplicationContext context2 = new AnnotationConfigApplicationContext("org/example/javaConfig");
        Calculator2 calculator2 =  context2.getBean("calculator2",Calculator2.class);
        System.out.println(calculator1.calculate(3, 3));
    }
}
