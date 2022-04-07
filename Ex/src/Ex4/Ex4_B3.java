package Ex4;

/**
 * 入力された２つの値の最大公約数を
 * ユークリッドの互除法で解く
 */

import java.util.Scanner;

public class Ex4_B3 {
	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	int gcd = getGCD(num1,num2);
	System.out.println(gcd);
}

private static int getGCD(int num1, int num2) {
	return num2 == 0 ? num1 : getGCD(num2, num1 % num2);
}
}
