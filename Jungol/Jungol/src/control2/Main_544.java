package control2;

import java.util.Scanner;

public class Main_544 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int j = sc.nextInt();
		
		for(int i=j; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}
}
