package operator;

import java.util.Scanner;

public class Main_520 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		System.out.println(i++);
		
		System.out.println(++i);
		sc.close();
	}
}
