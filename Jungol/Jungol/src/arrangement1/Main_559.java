package arrangement1;

import java.util.Scanner;

public class Main_559 {
	public static void main(String[] args) {
		//1.
//		double[] avg = new double[6];
//		avg[0] = 85.6;
//		avg[1] = 79.6;
//		
		//2.
		double[] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		System.out.printf("%.1f\n",score[n1-1] + score[n2 -1]);
	}
}
