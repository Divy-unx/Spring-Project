package com.springframework.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml")) {
            Vehicle bean = context.getBean("myVehicle", Vehicle.class);
            System.out.println(bean.getMileage());
        }
    }
}
