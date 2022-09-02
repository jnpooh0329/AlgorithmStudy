package rnwhcp;

import java.util.Scanner;
public class Main_617 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person[] p = new Person[5];
		for (int i=0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			p[i] = new Person(name, height);
		}
		sc.close();
		
		for(int i= 0; i < p.length; i++) {
//			p[i].print();
		}
		
		Person min = new Person("min", 190);
		for (int i=0; i<p.length; i++) {
			if(min.getHeight() > p[i].getHeight()) {
				min = p[i];
			}
		}
		min.print();
	}
}
		
class Person {
	private String name;
	private int height;
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public void print() {
		System.out.println(name + " " + height);
	}
	
	public int getHeight() {
		return height;		
	}
}