package operator;

import java.util.Scanner;

public class Main_524 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

//		boolean b1, b2;
//		if (num1 != 0) {
//			b1 = true;
//		} else {
//			b1 = false;
//		}
//		if (num2 != 0) {
//			b2 = true;
//		}else {
//			b2 = false;
//		}
//		System.out.println(a);
//		System.out.println(b);
		
		System.out.print((num1 != 0 && num2 != 0) + " ");
		System.out.println(num2 != 0 || num2 == 0);

		sc.close();
	}
}

// && ���� || ����