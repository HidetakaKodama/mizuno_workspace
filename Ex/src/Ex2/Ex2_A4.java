package Ex2;

import java.util.Scanner;

public class Ex2_A4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if (num > 84) {
			System.out.println("優");
		} else if(num > 74) {
			System.out.println("良");
		} else if (num > 59) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
}
}
