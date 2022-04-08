package Ex4;

import java.util.Scanner;

public class Ex4_C2 {
	public static void main(String[] args) {
		for (int c = 1; c < 4; c++) {
			Scanner s = new Scanner (System.in);
			int num = s.nextInt(3);
			int ran = new java.util.Random().nextInt(3);

			System.out.println("あなた:" + num);
			System.out.println("CP:" + ran);

			int num0 = 0;
			int num1 = 1;
			int num2 = 2;

			switch (ran) {
			case 1 :
				System.out.println(num0);
				break;

			case 2:
				System.out.println(num1);
				break;

			case 3:
				System.out.println(num2);
				break;
			}

			if ((num == 0) && (ran == 1) || (num == 1) && (ran == 2) || (num == 2) || (ran == 0)) {
				System.out.println("かち");
			} else if ((num == 0) && (ran == 2) || (num == 1) && (ran == 0) || (num == 2) && (ran == 1)) {
				System.out.println("まけ");
			} else {
				System.out.println("あいこ");
			}
		}
	}
}
