package operator;

import java.util.Scanner;

public class Main_115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mh = sc.nextInt();
		int mw = sc.nextInt();
		int kh = sc.nextInt();
		int kw = sc.nextInt();
		
		System.out.println(mh>kh && (mw>kw)? 1:0);
		
		sc.close();
	}
}
