package control2;

import java.util.Scanner;

public class Main_138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp = sc.nextInt();
		int inp2 = sc.nextInt();

		for (int i = inp; i <= inp2; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
			
		}

		sc.close();
	}

}
