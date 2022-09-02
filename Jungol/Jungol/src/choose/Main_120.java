package choose;

import java.util.Scanner;

public class Main_120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(i<j) {
			System.out.println(j-i);
		}else {
			System.out.println(i-j);
		}
		sc.close();
	}
}
