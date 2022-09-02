package choose;

import java.util.Scanner;

public class Main_632 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		int inp3 = sc.nextInt();
		
		if(inp1 < inp2) {
			min = inp1;
		} else {
			min = inp2;
		}
		
		if(min < inp3) {
			min = min;
		} else {
			min = inp3;
		}
		System.out.println(min);
		
		
//		int a = sc.nextInt();
//		int b =	sc.nextInt();
//		int c = sc.nextInt();
//		
//		int min = a > b ? b : a;
//		min = min > c ? c : min;
//		
//		System.out.println(min);
		
		sc.close();		
	}
}