package string1;

import java.util.Scanner;

public class Main_601 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String inp = sc.next();
      sc.close();

      for (int i = 1; i < inp.length() + 1; i++) {
         System.out.print(inp.substring(inp.length() - i, inp.length()));
         System.out.println(inp.substring(0, inp.length()-i));
      }
   }
}