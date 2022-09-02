package control3;

import java.util.Scanner;

public class Main_552 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf(" ");
			}
			for (int j = 1; j <= ((n - i) * 2 - 1); j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		sc.close();
	}
}