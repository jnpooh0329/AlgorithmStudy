package p3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[9];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}

		int num1 = 0, num2 = 0;
		int a =0, b = 0;
		for (a = 0; a < ar.length; a++) {
			for (b = 0; b < ar.length; b++) {
				if (sum - ar[a] - ar[b] == 100 && a != b) {
					num1 = a;
					num2 = b;
					break;
				}
			}
		}
		System.out.println("num1: " + num1 + ", num2 : " + num2);

		for (int k = 0; k < ar.length; k++) {
			if (k != num1 && k != num2) {
				System.out.println(ar[k]);
			}
		}
	}
}
