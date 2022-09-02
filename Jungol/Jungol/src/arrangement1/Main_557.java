package arrangement1;

import java.util.Scanner;

public class Main_557 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		for(int i=0; i<str.length; i++) {
	    	 str[i] = sc.next();
	     }
		sc.close();
		
//		for(int i=0; i<str.length; i++) {
//			System.out.println(str[i] + " ");
//		}
		System.out.println(str[0] + " " + str[3] + " " + str[6]);
	}
}
