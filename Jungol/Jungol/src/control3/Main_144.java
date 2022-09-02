package control3;

import java.util.*;

public class Main_144 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		
		a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a * 2 - 2 - i * 2; j++) {
				System.out.printf(" ");
			}
			
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.printf("*");
			
			}
			System.out.printf("\n");
		}
	}
}