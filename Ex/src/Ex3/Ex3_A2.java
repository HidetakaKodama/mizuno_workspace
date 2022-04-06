package Ex3;

import java.util.Scanner;

public class Ex3_A2 {
	public static void main(String[] args) {

    	Scanner s = new Scanner(System.in);
		String str = s.next();

//		for文
//		for(int i = 0; i < 5; i++) {
//			System.out.println(str);
//		}

//		while文
//		int i = 0;
//		while ( i < 5) {
//			System.out.println(str);
//			i++;
//		}

		int i = 0;
		do {
			System.out.println(str);
			i++;
		} while(i < 5);
	}
}
