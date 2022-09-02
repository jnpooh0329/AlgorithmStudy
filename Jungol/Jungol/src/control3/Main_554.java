package control3;

import java.util.Scanner;

public class Main_554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		int count = 1;
		char ch = 'A';
		
		for( int i = 0; i < line; i++) {
			for ( int j=line; i<j; j--)
				System.out.printf("%d ", count++);
		
		
		for (int k = 0; k <=i; k++)
			System.out.printf("%c ", ch++);
		System.out.print('\n');
		}
	}
}
