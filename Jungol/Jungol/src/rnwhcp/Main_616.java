package rnwhcp;

import java.util.Scanner;

//class Triangle {
//	double x1, x2, x3, y1, y2, y3;
//
//	public Triangle (double x1, double x2, double x3, double y1, double y2, double y3) {
//		this.x1 = x1;
//		this.x2 = x2;
//		this.x3 = x3;
//		this.y1 = y1;
//		this.y2 = y2;
//		this.y3 = y3;
//	}
//}	
import java.util.Scanner;
public class Main_616 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3;
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		sc.close();
		
		System.out.println("(" + Math.round(((x1 + x2 + x3) / 3) * 10.0) / 10.0 + ", "
				+ Math.round(((y1 + y2 + y3) /3) * 10.0) / 10.0 + ")");
	
	}
}