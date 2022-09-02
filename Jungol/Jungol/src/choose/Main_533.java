package choose;

import java.util.Scanner;

public class Main_533 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		
		if(18<=age && ch == 'M') {
			System.out.println("MAN");
		}else if (18<=age && ch == 'F') {
			System.out.println("WOMAN");
		}else if (18>age && ch == 'M'){
			System.out.println("BOY");
		}else {
			System.out.println("GIRL");
		}
		sc.close();
	}
}
