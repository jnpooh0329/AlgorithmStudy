package enter;

import java.util.Scanner;

public class Main_110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double yd = sc.nextDouble();
		sc.close();
		System.out.printf("%.1fyard = %.1fcm",yd,91.44f*yd);
	}
}