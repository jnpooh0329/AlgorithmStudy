package arrangement1;

import java.util.Arrays;
import java.util.Scanner;

public class Main_560 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10]; // �� 10�� ����
		
		for (int i=0; i<arr.length; i++) {
			arr [i] = sc.nextInt(); //����ڷκ��� arr.length���� �Է�
		}
		int min = arr[0]; // arr�� 0��° �ε��� ��ȣ�� min
		for(int i =1; i<arr.length; i++) {
			if(min>arr[i])
				min = arr[i];
		}
		sc.close();
			System.out.println(min);
		
		
//		int min = 1000;
//		for(int i=0; i< 10; i++) {
//			int inp = sc.nextInt();
//			if(min > inp) {
//				min = inp;
//			}
//		}
//		sc.close();	
//		System.out.println(min);
		
//		int[] arr = new int[10];
//		for (int i=0; i<arr.length; i++) {
//			arr [i] = sc.nextInt();
//	}
//		sc.close();
//		
//		for(int i =0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		System.out.println();
//		
////		Arrays.sort(arr);
////			Collections.reverseOrder()); //�⺻Ÿ��X
//		
//		for(int i =0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		System.out.println();
//		System.out.println(arr[0]);
	}
}
