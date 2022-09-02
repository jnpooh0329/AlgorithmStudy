package control3;

import java.util.*;

public class Main_140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0, sum = 0, count = 0;
		int avg = 0;

		for (int i = 0; i < 20; i++) {
			num = sc.nextInt();
			if (num == 0)
				break;
			
			count++;
			sum += num;
		}
		avg = sum/count;
		
		System.out.print(sum + " " + avg);
	}
}