package string1;

import java.util.Scanner;

public class Main_186 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();

		if (str1.length() > str2.length()) {
			System.out.print(str1.length());
		} else {
			System.out.print(str2.length());
		}
		sc.close();
		
//		String str1 = sc.next(), str2 = sc.next();
//
//	    System.out.println(str1.length() > str2.length() ? str1.length() : str2.length());

		
	}
}
