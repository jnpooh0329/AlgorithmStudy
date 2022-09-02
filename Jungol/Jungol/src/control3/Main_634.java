package control3;

import java.util.Scanner;

public class Main_634 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int i = 0;
//		while (i < n) {
//			int j = 0;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		for (int i = 0; i < n; i++) { // 줄바꾸기 위한 for문
			for (int j = 0; j <= i; j++) { // 별찍기 위한 for문
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}