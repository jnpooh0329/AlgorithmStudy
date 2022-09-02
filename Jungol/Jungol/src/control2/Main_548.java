package control2;

public class Main_548 {
	public static void main(String[] args) {
		int i, j;

		for (i = 2; i < 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.printf("%d * %d = %2d   ", i, j, i * j);
			}
			System.out.println();
		}
	}
}
