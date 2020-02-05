package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer = "";

        while(!answer.equals("нет")) {
            System.out.print("Введите математическое выражение: ");
            calc.setExpression(scan.nextLine());

            calc.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.nextLine();
            } while(!answer.equals("да") && !answer.equals("нет"));
        }
    }
}