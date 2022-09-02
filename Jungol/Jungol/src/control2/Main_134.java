package control2;

import java.util.*;

public class Main_134 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int num;
	 int even = 0; int odd = 0;
	 
	 for ( int i = 0; i< 10; i++) {
		 num = sc.nextInt();
		 if (num % 2 == 0) {
			 even++;
		 } else {
			 odd++;	 
		 }
	 }
	 System.out.println("even : " + even);
	 System.out.println("odd : " + odd);
	 sc.close();
 }
}
