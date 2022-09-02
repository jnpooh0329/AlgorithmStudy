package choose;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main_530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		if(20<=age) {
			System.out.println("adult");
		}else {
			System.out.println(20-age + " years later");
		}
	}
}

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
//		int n = 0;
//		try {
//			String inp = br.readLine();
//			Integer.parseInt(inp);  //WRAPPER CLASS
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		if(n >= 20) {
//			System.out.println();
//		}else {
//			System.out.println((20 - n) + " years later");
//		}
//	}
//}