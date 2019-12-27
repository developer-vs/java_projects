public class Calculator {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		char symbol = '^';

		if(symbol == '+') {
			System.out.println(num1 + num2);
		} else if(symbol == '-') {
			System.out.println(num1 - num2);
		} else if(symbol == '*') {
			System.out.println(num1 * num2);
		} else if(symbol == '/') {
			System.out.println(num1 / num2);
		} else if(symbol == '^') {
			int result = 1;
			if(num2 != 0) {
			    result = num1;
			    for(int i = 1; i < num2; i++) {
				    result *= num1;
			    }			
			}			
			System.out.println(result);
		} else if(symbol == '%') {
			System.out.println(num1 % num2);
		}
	}
}
