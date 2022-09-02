package control1;

import java.util.Scanner;

public class Main_633_error {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Korea\n2. USA\n3. Japan\n4. China");
			System.out.print("number? ");
			int inp = sc.nextInt();

			if (inp > 4) {
				System.out.println("\nnone\n");
				break;
			} else if (inp == 1) {
				System.out.println("\nSeoul\n");
			} else if (inp == 2) {
				System.out.println("\nWashington\n");
			} else if (inp == 3) {
				System.out.println("\nTokyo\n");
			} else if (inp == 4) {
				System.out.println("\nBeijing\n");
			}
		}
		sc.close();
	}
}
