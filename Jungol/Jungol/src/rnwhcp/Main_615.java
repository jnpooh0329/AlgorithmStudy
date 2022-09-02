package rnwhcp;

import java.util.Scanner;

public class Main_615 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		init in = new init(sc.next(),sc.nextInt(),sc.nextInt());
		init in2 = new init(sc.next(),sc.nextInt(),sc.nextInt());
		
		sc.close();

		in.print();
		in2.print();
		
		int koravg = (in.kor + in2.kor) / 2;
		int engavg = (in.eng + in2.eng) / 2;
		System.out.println("avg " + koravg + " " + engavg);
		
	}
}

class init {
	String name;
	int kor;
	int eng;
	
	public init(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	

	public void print() {
		System.out.println(this.name + " " + this.kor + " " + this.eng);
		
	}
}


	