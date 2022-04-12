package Ex4;

import java.util.Scanner;

public class Ex4_C2 {
	public static void main(String[] args) {
		for (int c = 1; c < 4; c++) {
			Scanner s = new Scanner (System.in);
			int num = s.nextInt();
			int ran = new java.util.Random().nextInt(3);

//			System.out.println("あなた:" + num);
//			System.out.println("CP:" + ran);


			String output1, output2;
			output1 = "";
			output2 = "";


			switch (num) {
			case 0:
				output1 = "グー";
				break;

			case 1:
				output1 = "チョキ";
				break;

			case 2:
				output1 = "パー";
				break;
			}

			switch (ran) {
			case 0:
				output2 = "グー";
				break;

			case 1:
				output2 = "チョキ";
				break;

			case 2:
				output2 = "パー";
				break;
			}

			if(num == ran) {
				System.out.println("あなた：" + output1);
				System.out.println("CP：" + output2);
				System.out.println("あいこ");
			} else if(((num == 0) && (ran == 1)) || ((num == 1) && (ran == 2)) || ((num == 2) || (ran == 0))) {
				System.out.println("あなた：" + output1);
				System.out.println("CP：" + output2);
				System.out.println("かち");
			} else {
				System.out.println("あなた：" + output1);
				System.out.println("CP：" + output2);
				System.out.println("まけ");
			}
//
//			if ((num == 0) && (ran == 1) || (num == 1) && (ran == 2) || (num == 2) || (ran == 0)) {
//				System.out.println("かち");
//			} else if ((num == 0) && (ran == 2) || (num == 1) && (ran == 0) || (num == 2) && (ran == 1)) {
//				System.out.println("まけ");
//			} else {
//				System.out.println("あいこ");
//			}
		}
	}
}
