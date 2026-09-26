package com.springframework.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    static void main() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Vehicle bean = context.getBean("myVehicle", Vehicle.class);
        System.out.println(bean.getMileage());
        System.out.println( bean.getDiscountMessage());
        System.out.println(bean.getBrandName());
        System.out.println(bean.getMaximumRetailPrice());

    }
}
