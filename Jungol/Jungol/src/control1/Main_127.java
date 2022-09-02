package control1;

import java.util.Scanner;

public class Main_127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int num;
//		int sum = 0;
//		int i = 0;
//		sum += i;
//		i++;
//		while(true) {
//			num = sc.nextInt();
//			if(num<0 || num>100) {
//				break;
//			}
//			System.out.println("sum : " + sum);
//			System.out.printf("avg : %.1f", avg/i);
//		}
//		System.out.println();

		
//		int[] ar = new int[100];
//		int i = -1;
//
//		do {
//			ar[i] = sc.nextInt();
//		} while (0 <= ar[i] && ar[i] <= 100);
//		sc.close();
//
////		System.out.println(i);
//
//		int sum = 0;
//		for (int j = 0; j < i - 1; j++) {
//			sum += ar[j];
//		}
//		System.out.println("sum : " + sum);
//		System.out.printf("avg : %.1f\n", (double) sum / (i));
	
		
		int sum = 0, cnt = 0;

		while (true) {
			int inp = sc.nextInt();
			if (inp < 0 || inp > 100) {
				break;
			} else {
				sum += inp;
				cnt++;
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", ((double) sum / (double) cnt));
	}
}