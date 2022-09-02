package rnwhcp;

import java.util.Scanner;

public class qoduf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person1[]ar = new Person1[2];
		for(int i =0; i<ar.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			ar[i] = new Person1(name, kor, eng);
		}
		sc.close();
		
		for (int i = 0; i<ar.length; i++) {
			ar[i].print();
		}
		int sum_kor = 0, sum_eng = 0;
		for(int i=0; i<ar.length; i++) {
			sum_kor += ar[i].getKor();
			sum_eng += ar[i].getEng();
		}
		System.out.println("avg " + (sum_kor / ar.length) + " " + (sum_eng / ar.length));
	}
}

class Person1 {
	private String name;
	private int kor;
	private int eng;
	
	public  Person1(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
}