package operator;

import java.util.Scanner;

public class Main_525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		if(a==b && b==c && a==c) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		sc.close();	
	}
}
