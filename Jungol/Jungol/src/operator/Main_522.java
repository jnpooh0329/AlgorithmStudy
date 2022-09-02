package operator;

import java.util.Scanner;

public class Main_522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(i==j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(i!=j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}