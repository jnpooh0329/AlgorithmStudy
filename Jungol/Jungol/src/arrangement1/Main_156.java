package arrangement1;

import java.util.Scanner;

public class Main_156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = 0;
		int max = -1000, min = 1000;
		
		while(true) {
			inp = sc.nextInt();
			
			if (inp == 999)
				break;
			if(max < inp)
				max = inp;
			if(min > inp)
				min = inp;
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		sc.close();
	}
}
