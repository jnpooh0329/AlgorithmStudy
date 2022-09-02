package rnwhcp;

import java.util.Scanner;

public class Main_196 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person[] m = new Person[3];
		for (int i = 0; i< p.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			p[i] = new Person(name, tel, addr);
		}

		sc.close();
		
		Person ps = p[0];
		for(int i = 0; i < p.length; i++) {
			if(ps.getName().charAt(0) > p[i].getName().charAt(0)) {
				ps = p[i];
			}
		}
		ps.print();
	}
}
class member {
	private String name;
	private String tel;
	private String addr;
	
	public member(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}
	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);

	}
}