package control3;

import java.util.*;

public class Main_149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int inp = 1;

		for (int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				System.out.printf("%d ", inp);
			
				inp = (inp + 2) % 10;
		}
			System.out.printf("\n");
	}
	sc.close();
	}
}

