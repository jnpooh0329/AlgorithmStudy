package string1;

import java.util.Scanner;

public class Main_600 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      String inp = sc.nextLine();
	      sc.close();

	      int cnt = 1;
	      for (int i = 0; i < inp.length(); i++) {
	         if (inp.charAt(i) == ' ') {
	            cnt++;
	         }
	      }
	      System.out.println(cnt);
	      
	      
//	      String str = sc.nextLine();
//	      sc.close();
//	      
//	      String[] strArr = str.split(" ");
//	      System.out.println(strArr.length);
	      
	      
//	      String s = sc.nextLine();
//	      sc.close();
//	      
//	      StringTokenizer str = new StringTokenizer(s, " ");
//	      System.out.println(str.countTokens());
	      
	      
	   }
	}