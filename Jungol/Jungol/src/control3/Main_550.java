package control3;

import java.util.Scanner;

public class Main_550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		sc.close();
	}
}