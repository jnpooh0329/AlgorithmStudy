package control3;

import java.util.*;

public class Main_141 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, i, tmp;

		a = sc.nextInt();

		for (i = 0; i < 100; i++) {
			tmp = a * (i + 1);

			if (tmp >= 100)
				break;
			System.out.printf("%d ", tmp);

			if (tmp % 10 == 0)
				break;
		}
	}
}