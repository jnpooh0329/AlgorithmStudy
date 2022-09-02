package arrangement1;

import java.util.Scanner;

public class Main_154 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double[] arr = new double[6];
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		avg = sum / 6;
		Math.round(avg);

		System.out.printf("%.1f", avg);

		sc.close();
	}

}