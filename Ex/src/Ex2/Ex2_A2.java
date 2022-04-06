package Ex2;

import java.util.Scanner;

public class Ex2_A2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if (num == 1) {
			System.out.println("赤");
		} else if(num == 2) {
			System.out.println("黄");
		} else {
			System.out.println("青");
		}
	}
}
