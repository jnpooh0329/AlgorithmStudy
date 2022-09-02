package control1;

import java.util.Scanner;

public class Main_540 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int i = sc.nextInt();
			if(i % 3 == 0) {
				System.out.println(i/3);
			}
			if (i % 3 == -1) {
				break;
			}
		}
		sc.close();
	}
}

// i % 3 == 0 3배수 구하는 공식
// i % 3 != 0 부정
		
		