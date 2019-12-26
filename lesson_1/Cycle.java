public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println();

		int i = 6;
		while(i >= -6) {
			System.out.println(i);
			i -= 2;
		}

		System.out.println();

		int j = 10;
		int result = 0;
		do {
			if(j % 2 != 0) {
				result += j;
			}
			j++;
		} while(j <= 20);
		System.out.println(result);
	}
}