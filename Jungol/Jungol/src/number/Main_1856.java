package number;

import java.util.Scanner;

public class Main_1856 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		int num = 1;
		for (int i = 1; i < n; i++) {
			for ( int j = 0; j< m; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}
