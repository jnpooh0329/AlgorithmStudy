package Q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int score = 0, tmp;
//		for(int i = 0; i < 5; i++) {
//			tmp = sc.nextInt();
//			if(tmp < 40) {
//				tmp = 40;
//			}
//			score += tmp;
//		}
//		System.out.println(score / 5);
		
		int[] ar = new int[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] < 40) {
				sum += 40;
			}else {
				sum += ar[i];
			}
		}
		System.out.println(sum/ar.length);
	}
}
