package function1;

import java.util.Scanner;

public class Main_575 {
	public static int power(int a, int b) {

		int num = a;

		for (int i = 1; i < b; i++) {
			num *= a;
		}
		if (b == 0) {
			return 1;
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if (a <= 10 && b <= 10) {
			System.out.println(power(a, b));
		}
	}
}
