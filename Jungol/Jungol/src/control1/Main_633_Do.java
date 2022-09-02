package control1;

import java.util.Scanner;

public class Main_633_Do {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inp = 0;
		do {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");
			inp = sc.nextInt();
			
			switch (inp) {
			case 1:
				System.out.println("Seoul");
				break;
			case 2:
				System.out.println("Washington");
				break;
			case 3:
				System.out.println("Tokyo");
				break;
			case 4:
				System.out.println("Beijing");
				break;
			default:
				System.out.println("none");
				
			}
			System.out.println();
		} while (1 <= inp && inp  <= 4); {
		  sc.close();
		}
	}
}
