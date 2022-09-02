package control1;

import java.util.Scanner;

public class Main_126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int odd = 0, even = 0;

		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			} else if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
//		int odd = 0, even = 0;
//		for(;;) {
//			int inp = sc.nextInt();
//			if(inp == 0) break;
//			
//			if(inp % 2 ==0) {	
//				even++;
//			} else {
//				odd++;
//			}
//		}
		sc.close();

		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
