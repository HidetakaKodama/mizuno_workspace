package Ex2;

import java.util.Scanner;

public class Ex2_A3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();

		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
}
