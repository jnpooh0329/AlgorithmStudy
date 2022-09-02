package choose;

import java.util.Scanner;

public class Main_531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		sc.close();
		
		String str = " ";
		if(i <= 50.80) {
			str = "Flyweight";
		}else if(i <= 61.23) {
			str = "Lightweight";
		}else if (i <= 72.57) {
			str = "Middleweight";
		}else if (i <= 88.45) {
			str = "Cruiserweight";
		}else {
			str = "Heavyweight";
		}
		System.out.println(str);
	}
}
