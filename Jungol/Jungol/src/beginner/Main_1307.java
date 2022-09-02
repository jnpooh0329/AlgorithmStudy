package beginner;

import java.util.Scanner;

public class Main_1307 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();

//      System.out.println(n);

      int[][] ar = new int[n][n];
      int num = 1;
      for (int i = n - 1; i >= 0; i--) {
         for (int j = n - 1; j >= 0; j--) {
            if(num > 26)
               num = 1;
            ar[j][i] = num++;
         }
      }

      for (int i = 0; i < ar.length; i++) {
         for (int j = 0; j < ar[i].length; j++) {
            System.out.print((char) (ar[i][j] + 64) + " ");
         }
         System.out.println();
      }
   }
}