package com.startjava.lesson_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char mathOperator;

    public void setExpression(String expression) {
        String[] arr = expression.split(" ");
        num1 = Integer.parseInt(arr[0]);
        num2 = Integer.parseInt(arr[2]);
        mathOperator = arr[1].charAt(0);
    }

    public void calculate() {
        switch(mathOperator) {
            case '+':
                System.out.println(Math.addExact(num1, num2));
                break;
            case '-':
                System.out.println(Math.subtractExact(num1, num2));
                break;
            case '*':
                System.out.println(Math.multiplyExact(num1, num2));
                break;
            case '/':
                System.out.println(Math.floorDiv(num1, num2));
                break;
            case '^':
                System.out.println(Math.pow(num1, num2));
                break;
            case'%':
                System.out.println(Math.floorMod(num1, num2));
                break;
            default:
                System.out.println("Вы использовали неправильный математический оператор");
        }
    }
}