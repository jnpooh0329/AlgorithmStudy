package control3;

import java.util.*;

public class Main_148 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("# ");
			}
			System.out.printf("\n");
		}

		for (int i = 0; i < a-1; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.printf("  ");
			}
			for (int j = 0; j < a-i-1; j++) {
				System.out.printf("# ");
			}
			System.out.printf("\n");
		}
		sc.close();
	}
}