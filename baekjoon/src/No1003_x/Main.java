package No1003_x;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int case_num = scanner.nextInt();
		
		for (int i = 0; i < case_num; i++) {
			int n = scanner.nextInt();
			int[] result = fibonacci_test(n);
			System.out.println(result[0] + " " + result[1]);
		}
	}
	
	static int[] fibonacci_test(int n) {
		int[] result = new int[2];
		
		if (n == 0) {
			result[0] = 1;
			result[1] = 0;
		} else if (n == 1) {
			result[0] = 0;
			result[1] = 1;
		} else {
			result[0] = fibonacci_test(n - 1)[0] + fibonacci_test(n - 2)[0];
			result[1] = fibonacci_test(n - 1)[1] + fibonacci_test(n - 2)[1];
		}
		
		return result;
	}
}