package beginner;

import java.util.Scanner;

public class Main_1338 {

	Scanner sc = new Scanner(System.in);
		
		static int[][] ar;
		   static int N, x, y = 0;
		   static int num = 1;
		   static int range = 1;

		   public static void print() {
//		      System.out.println("-------------------");
		      for (int i = 0; i < ar.length; i++) {
		         for (int j = 0; j < ar[i].length; j++) {
		            if (ar[i][j] == 0) {
		               System.out.printf("  ");
		            } else {
		               System.out.printf("%c ", (char) (ar[i][j] + 'A' - 1));
		            }
		         }
		         System.out.println();
		      }
		   }

		   public static void move() {
		      ar[y++][x--] = num++;
		      if(num == 27) num = 1;
//		      print();
		      if (y == N) {
		         y = range++;
		         x = ar.length - 1;
		      }
		   }

		   public static boolean check_boundary() {
		      if (y == N && x == N - 1) {
		         return false;
		      } else {
		         return true;
		      }
		   }

		   public static void main(String args[]) {
		      Scanner sc = new Scanner(System.in);
		      N = sc.nextInt();
		      ar = new int[N][N];
		      sc.close();

		      x = ar.length - 1;
		      while (check_boundary()) {
		         move();
		      }
		      print();
		   }
		}
