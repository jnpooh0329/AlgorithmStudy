package control3;

import java.util.Scanner;

public class Main_553 {
	public static void main(String[] args) {
		 int n;
		 char inp='A';
		 Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 for(int i=0;i<n;i++){
	         for(int j=1;j<=n-i;j++){
	          System.out.printf("%c", inp);
	          inp++;
	         }
	         System.out.printf("\n");
		 }
		 sc.close();
	}
}