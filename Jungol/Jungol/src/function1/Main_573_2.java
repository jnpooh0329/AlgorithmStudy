package function1;

import java.util.Scanner;

public class Main_573_2 {
	public static void print(int n) {
		int m = 1;
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print(m++ + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		print(n);
	}
}
