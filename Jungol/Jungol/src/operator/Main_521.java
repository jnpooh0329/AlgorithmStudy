package operator;

import java.util.Scanner;

public class Main_521 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		i++; // i = i + 1
		--j; // j = j - 1
		
		System.out.println(i + " " + j + " " + --i*j);
		
		sc.close();
	}
}
