package control2;

import java.util.Scanner;

public class Main_545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m3 = 0, m5 = 0;
		int num, i;
		
		for(i=0;i<10;i++){
	         num = sc.nextInt();
	         if(num % 3 == 0) m3++;
	         if(num % 5 == 0) m5++;
		
		}
	         System.out.println("Multiples of 3 : " + m3);
	         System.out.println("Multiples of 5 : " + m5);
		sc.close();
	}
}