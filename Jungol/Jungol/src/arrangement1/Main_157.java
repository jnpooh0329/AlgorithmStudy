package arrangement1;

import java.util.Scanner;

public class Main_157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		int sum = 0;
		double avg=0;

		int save=0;
		int count=0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == 0) {
				save = i;
				break;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i]; j++) {
				break;
			}
		}
		System.out.println("Multiples of " + save + ": " + count);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}
}
