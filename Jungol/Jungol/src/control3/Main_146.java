package control3;

import java.util.*;

public class Main_146 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int tmp1 = 0;
		char tmp2 = 'A';
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a-i-1; j++) {
				System.out.printf("%c ", tmp2++);
			}
			for (int j = 0; j < i; j++) {
				System.out.printf("%d ", tmp1++);
			}
			System.out.printf("\n");
		}
		sc.close();
	}
}