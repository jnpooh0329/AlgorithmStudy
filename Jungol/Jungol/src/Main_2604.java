package Q2604;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String inp = sc.next();
      sc.close();

//      System.out.println(inp);

      char c = '\0';
      int len = 0;
      for (int i = 0; i < inp.length(); i++) {
         if (i == 0) {
            c = inp.charAt(i);
            len = 10;
         } else {
            if (c == inp.charAt(i)) {
               len += 5;
            } else {
               len += 10;
               c = inp.charAt(i);
            }
         }
      }
      System.out.println(len);
   }
}