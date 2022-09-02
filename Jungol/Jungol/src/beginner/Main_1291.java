package beginner;

import java.util.Scanner;

public class Main_1291 {

	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int s, e;
	      while (true) {
	         s = sc.nextInt();
	         e = sc.nextInt();
	         if (2 > s || s > 9 || 2 > e || e > 9) {
	            System.out.println("INPUT ERROR!");
	         } else {
	            break;
	         }
	      }
	      sc.close();

//	      System.out.println(s + " " + e);
	      if (s > e) {
	         for (int i = 1; i <= 9; i++) {
	            for (int j = s; j >= e; j--) {
	               System.out.print(j + " * " + i + " = ");
	               System.out.printf("%2d   ", j * i);
	            }
	            System.out.println();
	         }
	      } else {
	         for (int i = 1; i <= 9; i++) {
	            for (int j = s; j <= e; j++) {
	               System.out.print(j + " * " + i + " = ");
	               System.out.printf("%2d   ", j * i);
	            }
	            System.out.println();
	         }
	      }
	   }
	}