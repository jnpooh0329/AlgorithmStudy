package control2;

import java.util.Scanner;

public class Main_135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		int count = 0;
		double avg = 0;
		
		if (num1 < num2) {
			for (int i = num1; i<=num2; i++) {
				if((i%3) == 0) {
					sum += i;
					count++;
				}
				else if ((i%5)== 0) {
					sum += i;
					count++;
				}
			}
		}
		else {
			for (int i=num2; i<=num1; i++) {
				if((i%3) == 0) {
					sum += i;
					count++;
				}
				else if ((i%5) == 0) {
					sum+= i;
					count++;
				}
			}
		}
		avg = (double)sum/count;
		
		System.out.printf("sum : %d\n", sum);
		System.out.printf("avg : %.1f", avg);	
	}
}