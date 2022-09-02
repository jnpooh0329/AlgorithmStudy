package control1;

import java.util.Scanner;

public class Main_125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i = 1;
		num = sc.nextInt();
		
		while(i<=num) {
			System.out.printf("%d ",i);
			i++;
		}
		sc.close();
	}
}
