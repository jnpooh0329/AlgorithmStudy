package p10828;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		KSJStack stk = new KSJStack();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String input = sc.next();
			switch (input) {
			case "push":
				int inum = sc.nextInt();
				stk.push(inum);
				break;
			case "top":

				break;
			case "size":
				stk.size();
				break;
			case "empty":
				stk.empty();
				break;
			case "pop":
				System.out.println();
				break;
			}
		}
		sc.close();
	}
}

class KSJStack {
	private int[] ar;
	private int top;

	public KSJStack() {
		ar = new int[10000];
		top = -1;
	}

	public void push(int n) {
		ar[++top] = n;
	}

	public void pop() {
		if(top == -1) {
			System.out.println("-1");
		} else {
			System.out.println(ar[top--]);
		}
	}

	public void size() {
		System.out.println(top + 1);
	}

	public void empty() {
		if (top == -1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public void top() {
		if (top >= 0) {
			System.out.println(ar[top]);
		} else {
			System.out.println("-1");
		}
	}
}