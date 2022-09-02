package control2;

import java.util.Scanner;

public class Main_136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int j = 1; j <= 10; j++) {
			System.out.print(a * j + " ");
		}
		sc.close();
	}

}
