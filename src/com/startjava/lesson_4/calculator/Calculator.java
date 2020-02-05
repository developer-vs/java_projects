package com.startjava.lesson_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char mathOperator;
    private int result;

    public Calculator(String expression) {
        String[] arr = expression.split(" ");
        num1 = Integer.parseInt(arr[0]);
        num2 = Integer.parseInt(arr[2]);
        mathOperator = arr[1].charAt(0);
    }

    public int calculate() {
        switch(mathOperator) {
            case '+':
                result = Math.addExact(num1, num2);
                break;
            case '-':
                result = Math.subtractExact(num1, num2);
                break;
            case '*':
                result = Math.multiplyExact(num1, num2);
                break;
            case '/':
                result = Math.floorDiv(num1, num2);
                break;
            case '^':
                result = (int)Math.pow(num1, num2);
                break;
            case'%':
                result = Math.floorMod(num1, num2);
                break;
            default:
                System.out.println("Вы использовали неправильный математический оператор");
        }
        return result;
    }
}