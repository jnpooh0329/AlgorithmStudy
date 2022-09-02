package beginner;

import java.util.Scanner;

public class Main_1314 {
	   enum DIRECTION {
	      DOWN, RIGHT1, UP, RIGHT2
	   };

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      sc.close();

	      // int n = 3;
	      // System.out.println(n);

	      char ch = 'A';
	      char[][] ar = new char[n][n];

	      int i = 0, j = 0;
	      DIRECTION d = DIRECTION.DOWN;

	      while (true) {
	         if (n % 2 != 0) {
	            if (i == n - 1 && j == n - 1) {
	               ar[i][j] = ch;
	               break;
	            }
	         } else {
	            if (i == n - 1 && j == 0) {
	               ar[i][j] = ch;
	               break;

	            }
	         }

	         ar[i][j] = ch++;
	         if (ar[i][j] > 'Z') {
	            ch = 'A';
	            ar[i][j] = ch++;
	         }

	         if (d == DIRECTION.DOWN) {
	            j++;
	            if (j == n - 1) {
	               d = DIRECTION.RIGHT1;
	            }
	         } else if (d == DIRECTION.RIGHT1 || d == DIRECTION.RIGHT2) {
	            i++;
	            // if (i == n-1) {
	            if (d == DIRECTION.RIGHT1) {
	               d = DIRECTION.UP;
	            } else {
	               d = DIRECTION.DOWN;
	            }
	            // }
	         } else {
	            j--;
	            if (j == 0) {
	               d = DIRECTION.RIGHT2;
	            }
	         }
	      }

	      for (i = 0; i < n; i++) {
	         for (j = 0; j < n; j++) {
	            System.out.print(ar[j][i] + " ");
	         }
	         System.out.println();
	      }
	   }
	}