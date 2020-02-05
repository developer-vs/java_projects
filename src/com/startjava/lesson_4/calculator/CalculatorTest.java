package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";

        while(!answer.equals("нет")) {
            System.out.print("Введите математическое выражение: ");
            Calculator calc = new Calculator(scan.nextLine());
            System.out.println(calc.calculate());

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.nextLine();
            } while(!answer.equals("да") && !answer.equals("нет"));
        }
    }
}