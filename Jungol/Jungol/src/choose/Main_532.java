package choose;

import java.util.Scanner;

public class Main_532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		
		if(i >= 4.0 && j >= 4.0) {
			System.out.println("A");
		}else if (i >= 3.0 && j >= 3.0) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
	}
}
