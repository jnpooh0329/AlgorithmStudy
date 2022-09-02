package control2;

import java.util.*;

public class Main_133 {
	public static void main(String[] args) {
		int num, i, score;
		float avg = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (i = 0; i < num; i++) {
			score = sc.nextInt();
			avg += score;
		}
		avg /= (float) i;
		System.out.printf("%.2f\n", avg);
	}
}