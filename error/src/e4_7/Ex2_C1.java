package e4_7;

import java.util.Scanner;

/**
 * コンピューターとじゃんけんを行うプログラム
 * 0:グー
 * 1:チョキ
 * 2:パー
 *
 * @author WEBEDGE
 *
 */

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

/*
エラーコード
Exception in thread "main" java.util.InputMismatchException: For input string: "2"
	at java.util.Scanner.nextInt(Scanner.java:2123)
	at e4_7.Ex2_C1.main(Ex2_C1.java:18)

エラー内容
標準入力された2が出力できない。

解決方法
0、1、2の3つの数値がじゃんけんプログラムには必要だが、
18行目、19行目のnextInt(2)には0と1の2つしか入らない。
nextInt(3)にしてあげることで、0、1、2の3つの数値を
入れることができる。

*/
