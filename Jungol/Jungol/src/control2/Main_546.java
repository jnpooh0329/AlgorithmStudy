package control2;

import java.util.Scanner;

public class Main_546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += sc.nextInt();
		}
		sc.close();
		
		double avg=(double) sum/n;
		System.out.printf("avg : %.1f\n", avg);
		if (avg >= 80.0) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
}
