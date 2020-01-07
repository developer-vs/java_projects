import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;

        while(true) {

            System.out.print("Введите первое число: ");
            calc.setNum1(scan.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setMathOperator(scan.next().charAt(0));

            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextInt());

            calc.getCalculatedNumber();

            System.out.print("Хотите продолжить? [да/нет]: ");
            answer = scan.next();

            if(answer.equals("да")) {
                continue;
            } else if(answer.equals("нет")) {
                break;
            } else {
                continue;
            }
        }
    }
}