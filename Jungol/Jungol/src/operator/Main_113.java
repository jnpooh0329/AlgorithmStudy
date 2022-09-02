package operator;

import java.util.Scanner;

public class Main_113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt()+5;
		int j = sc.nextInt()*2;
		
		System.out.println("width = " + i);
		System.out.println("length = " + j);
		System.out.println("area = " + i*j);
		
		sc.close();
	}
}
