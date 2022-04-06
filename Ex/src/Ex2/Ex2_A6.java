package Ex2;

import java.util.Scanner;

public class Ex2_A6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int gen = s.nextInt();
		int week = s.nextInt();

		if ((gen == 1) && (week == 3)) {
			System.out.println("チケットは1000円です。");
		} else if ((gen == 1) || (week == 3)) {
			System.out.println("チケットは1600円です。");
		} else {
			System.out.println("チケットは2000円です。");
		}
	}
}
