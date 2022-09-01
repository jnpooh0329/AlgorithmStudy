import java.util.Scanner;

public class Main_BaekJoon10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		sc.close();
		for (int i = 0; i < A.length; i++) {
			if (A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
	}
}
