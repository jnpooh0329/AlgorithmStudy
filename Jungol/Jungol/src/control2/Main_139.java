package control2;

import java.util.Scanner;

public class Main_139 {
	public static void main(String[] args) {
		int a, b, i, j;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if (a < b) {
			for (i = 1; i <= 9; i++) {
				for (j = a; j <= b; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
				System.out.printf("\n");
			}
		} else {
			for (i = 1; i <= 9; i++) {
				for (j = a; j >= b; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
				System.out.printf("\n");
			}
		}
	}
}
