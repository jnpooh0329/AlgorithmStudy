package choose;

import java.util.Scanner;

public class Main_121 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i == 0) {
			System.out.println("zero");
		}else if(i > 0){
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
		sc.close();
	}
}