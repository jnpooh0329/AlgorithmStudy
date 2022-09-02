package choose;

import java.util.Scanner;

public class Main_534 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char str = sc.next().charAt(0);
		
		if(str == 'A') {
			System.out.println("Excellent");
		}else if (str == 'B') {
			System.out.println("Good");
		}else if (str == 'C') {
			System.out.println("Usually");
		}else if (str == 'D') {
			System.out.println("Effort");
		}else if (str == 'F') {
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}
		sc.close();
	}
}
