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

		for (int i = 0; i < n; i++) { // �ٹٲٱ� ���� for��
			for (int j = 0; j <= i; j++) { // ����� ���� for��
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}