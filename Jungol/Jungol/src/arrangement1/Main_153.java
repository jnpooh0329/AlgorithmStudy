package arrangement1;

import java.util.Scanner;

public class Main_153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		
		int i = 0;
		do {
			ar[i] = sc.nextInt();
		}while(ar[i++] != -1);
		sc.close();
		
		//print all
//		for(int j =0; j<i; j++) {
//			System.out.print(ar[j] + " ");
//		}
		if(i-4<0 ) {
			for(int j =0; j<i-1; j++) {
				System.out.print(ar[j] + " ");
			}
		}else {
			for(int j =i-4; j<i-1; j++) {
				System.out.print(ar[j] + " ");
			}
		}
	}
}
