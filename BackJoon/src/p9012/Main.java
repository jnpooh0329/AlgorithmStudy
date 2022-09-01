package p9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			boolean b = true;
			String inp = sc.next();
			stk.clear();
			for (int j = 0; j < inp.length(); j++) {
				char c = inp.charAt(j);
				if (c == '(') {
					stk.push(c);
				} else {
					if (stk.size() > 0) {
						stk.pop();
					} else {
						b = false;
						break;
					}
				}
			}
			if (stk.size() == 0 && b == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
		
//		for (int i = 0; i < T; i++) {
//	         String inp = sc.next();
//	         int res = 0;
//	         boolean b = true;
//
//	         for (int j = 0; j < inp.length(); j++) {
//	            char c = inp.charAt(j);
//	            if (c == '(') {
//	               res++;
//	            } else {
//	               res--;
//	               if (res < 0) {
//	                  b = false;
//	                  break;
//	               }
//	            }
//	         }
//	         if (res == 0 && b == true) {
//	            System.out.println("YES");
//	         } else {
//	            System.out.println("NO");
//	         }
//	      }
//	      sc.close();
//	   }
//	}
