package com.google;

import com.google.vehcle.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LombokBuilderTest {

    public static void main(String[] args) {
        SpringApplication.run(LombokBuilderTest.class, args);
//        Car car = new Car("1","Honda","Civic");

        Car car = Car.builder()
                .id("2")
                .model("Accord")
                .make("Honda")
                .Owner("Ram")
                .Owner("Sita")
                .Owner("hanuma")
                .build();

        System.out.println(car.toString());

    }
}
