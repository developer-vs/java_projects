package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Striker Eureka", "Mark-5", "Australia", 10);
        System.out.println(jaegerOne.getSpeed());
        System.out.println(jaegerOne.checkStatus());

        Jaeger jaegerTwo = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 4);
        System.out.println(jaegerTwo.getSpeed());
        System.out.println(jaegerTwo.checkStatus());
        jaegerTwo.setSpeed(2);
        System.out.println(jaegerTwo.getSpeed());
    }
}