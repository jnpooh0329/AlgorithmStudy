package operator;

import java.util.Scanner;

public class Main_518 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		sc.close();
		
		System.out.println("sum : " + (i+j+k));
		System.out.println("avg : " + (int)((i+j+k)/3));
	}
}
