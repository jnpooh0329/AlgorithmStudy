import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		s.close();
		
//		System.out.println(score);
		
		if (90 <= score) {
			System.out.println("A");
		}else if(80 <= score) {
			System.out.println("B");
		}else if(70 <= score) {
			System.out.println("C");
		}else if(60 <= score) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
