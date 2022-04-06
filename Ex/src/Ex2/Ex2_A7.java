package Ex2;

import java.util.Scanner;

public class Ex2_A7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		switch(num) {
		case 1:
			System.out.println("赤");
			break;

		case 2:
			System.out.println("黄");
			break;

		case 3:
			System.out.println("青");
			break;
		}
	}
}
