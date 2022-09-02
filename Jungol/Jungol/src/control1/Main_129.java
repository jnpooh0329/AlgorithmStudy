package control1;

import java.util.Scanner;

public class Main_129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Base = ");
			int Base = sc.nextInt();
			System.out.print("Height = ");
			int Height = sc.nextInt();
			System.out.printf("Triangle width = %.1f\n", (double) 1 / 2 * Base * Height);
			System.out.print("Continue? ");
			String str = sc.next();
			if (!str.equals("Y") && !str.equals("y")) {
				break;
			}
		}
		sc.close();
	}
}
