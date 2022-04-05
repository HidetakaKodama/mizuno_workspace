package Ex2;

import java.util.Scanner;

public class Ex2_B2 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();

		if (num>13) {
			System.out.println("範囲外です。");
		} else if(num % 2 == 0) {
			System.out.println("偶数月です。");
		} else {
			System.out.println("奇数月です。");
		}

//		if (num % 2 == 0) {
//			System.out.println("偶数月です。");
//		} else if (num % 2 != 0) {
//			System.out.println("奇数月です。");
//		}
	}
}
