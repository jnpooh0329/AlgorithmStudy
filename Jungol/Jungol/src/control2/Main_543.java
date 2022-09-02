package control2;

import java.util.Scanner;

public class Main_543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int j=2; j<=i; j+=2) {
			System.out.printf("%d ",j);
		}
		sc.close();
	}
}
