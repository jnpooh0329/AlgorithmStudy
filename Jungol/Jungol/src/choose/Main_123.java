package choose;

import java.util.Scanner;

public class Main_123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Number? ");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
			break;
		}
		sc.close();
	}
}
