package Q1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		sc.close();
		
		int cnt = 1;
		for (int i= 0; i < inp.length(); i++) {
			if(inp.charAt(i) == ' ' && i != inp.length() -1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
