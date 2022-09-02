package arrangement1;

import java.util.Scanner;

public class Main_159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();

		int[] arr = new int[inp];

		for (int i = 0; i < inp; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < inp - 1; i++) {
			for (int j = i + 1; j < inp; j++) {
				if (arr[i] < arr[j]) {
					int tep = arr[i];

					arr[i] = arr[j];
					arr[j] = tep;
				}
			}
		}
		for (int i = 0; i < inp; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}