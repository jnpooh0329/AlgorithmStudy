package string1;

import java.util.Scanner;

public class Main_596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int inp = sc.nextInt();
		sc.close();

//		System.out.println(str + " " + inp);

		// 2. -----------------------------------
		StringBuilder sb = new StringBuilder(str);
//		System.out.println(sb);

		StringBuilder sb2 = sb.reverse();

		for (int i = 0; i < inp; i++) {
			System.out.print(sb2.charAt(i));
		}

		// 1. -----------------------------------

//		if (str.length() >= inp) {
//			for (int i = str.length() - 1, cnt = 0; cnt < inp; i--, cnt++) {
//				System.out.print(str.charAt(i));
//			}
//		} else {
//			for (int i = str.length() - 1; i >= 0; i--) {
//				System.out.print(str.charAt(i));
//			}
//		}

	}
}