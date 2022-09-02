package control1;

import java.util.Scanner;

public class Main_128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;

		while (true) {
			int inp = sc.nextInt();
			if (inp == 0)
				break;
			if (inp % 3 != 0 && inp % 5 != 0) {
				i++;
			}
		}
		System.out.print(i);
		sc.close();
	}
}