package control3;

import java.util.*;

public class Main_147 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int tmp1 = 1;
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("  ");
			}

			for (int j = 0; j <= a - i - 1; j++) {
				System.out.printf("%d ", tmp1++);
			}
			System.out.printf("\n");
		}
		sc.close();
	}
}