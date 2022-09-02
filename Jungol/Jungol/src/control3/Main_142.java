package control3;

import java.util.*;

public class Main_142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, i, j;

		a = sc.nextInt();

		for (i = 0; i < a; i++) {
			for (j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		for (i = 0; i < a; i++) {
			for (j = 0; j < a - i - 1; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}