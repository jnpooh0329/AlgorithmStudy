package enter;

import java.util.Scanner;

public class Main_515 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		sc.close();
		
		System.out.println(i + " * " + j + " = " + (i*j));
		System.out.println(i +" / "+ j + " = " + (i/j));	
	}
}
