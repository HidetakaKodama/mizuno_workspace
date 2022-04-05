package Ex2;

import java.util.Scanner;

public class Ex2_C1 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num = s.nextInt(2);
		int ran = new java.util.Random().nextInt(2);

		System.out.println(num);
		System.out.println(ran);

		if ((num == 0 && ran == 1) || (num == 1 && ran == 2) || (num == 2 && ran == 0)) {
			System.out.println("かち");
		} else if((num == 0 && ran == 2) || (num == 1 && ran == 0) || (num == 2 && ran == 1)) {
			System.out.println("まけ");
		} else {
			System.out.println("あいこ");
		}
	}
}
