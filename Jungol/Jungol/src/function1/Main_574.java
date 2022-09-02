package function1;

import java.util.Scanner;

public class Main_574 {

	public static void answer() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		sc.close();
		
		if (num1 >= num2 && num2 >= num3) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3);
        }
    }

	public static void main(String[] args) {
		answer();
	}
}
