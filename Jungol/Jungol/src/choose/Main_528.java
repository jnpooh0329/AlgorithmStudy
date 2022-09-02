package choose;

import java.util.Scanner;

public class Main_528 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		System.out.println(i);
		sc.close();
		
		if(i < 0) {
			System.out.println("minus");
		}
	}
}
