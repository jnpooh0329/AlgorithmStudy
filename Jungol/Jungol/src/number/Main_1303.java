package number;

import java.util.Scanner;

public class Main_1303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

//		int num = 1;
//		for (int i = 0; i < n; i++) {
//			if (i % 2 == 0) {
//				if (i != 0) {
//					num = (num + 1) + m;
//				}
//				for (int j = 0; j < m; j++) {
//					System.out.print(num++ + " ");
//				}
//				System.out.println();
//			} else {
//				num = (num - 1) + m;
//				for (int j = m; j > 0; j--) {
//					System.out.print(num-- + " ");
//				}
//				System.out.println();
//			}
//		}
		
//		 int[][] ar = new int[n][m];
//	      int num = 1;
//
//	      for (int i = 0; i < ar.length; i++) {
//	         if (i % 2 == 0) {
//	            for (int j = 0; j < ar[i].length; j++) {
//	               ar[i][j] = num++;
//	            }
//	         } else {
//	            for (int j = m - 1; j >= 0; j--) {
//	               ar[i][j] = num++;
//	            }
//	         }
//	      }
//
//	      for (int i = 0; i < ar.length; i++) {
//	         for (int j = 0; j < ar[i].length; j++) {
//	            System.out.printf(ar[i][j] + " ");
//	         }
//	         System.out.println();
//	      }
	}
}
