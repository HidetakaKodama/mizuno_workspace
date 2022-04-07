package Ex4;

import java.util.Scanner;

public class Ex4_A3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "こんにちは";
		str = s.next();

		switch (str){
		case "こんにちは":
			System.out.println("こんにちは");
			break;

			default:
				System.out.println("こんにちはと入力してください");
		}

//
//		System.out.println("こんにちは");
//
//		if (str != "こんにちは") {
//			System.out.println("こんにちはと入力してください");
//		}

//
//		if (str == kon) {
//			System.out.println("こんにちは");
//		} else {
//			System.out.println("こんにちはと入力してください");
//		}

	}
}
