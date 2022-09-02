package control3;

import java.util.Scanner;

public class Main_549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int n = sc.nextInt();
		int sum = 0;
		for(i=1; sum<n; i+=2) {
			sum += i;
		}
		System.out.println(i/2 + " " + sum);
		sc.close();
	}
}
