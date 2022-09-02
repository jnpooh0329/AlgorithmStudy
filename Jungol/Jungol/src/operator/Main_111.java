package operator;

import java.util.Scanner;

public class Main_111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int com = sc.nextInt();
		
		System.out.println("sum " + (kor+eng+math+com));
		System.out.println("avg " + ((kor+eng+math+com)/4));
		
		sc.close();
	}
}
