package Ex4;

/**
 * Ex4-A2
 * 標準入力から整数を５回入力し最も大きい値を表示する
 */

import java.util.Scanner;
public class Ex4_A2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num= s.nextInt();
		int max = 0;
		int[] array = new int[num];

		for(int i = 0; i < 4; i++) {
			array[i] = s.nextInt();
			if( max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);

//		Scanner s = new Scanner(System.in);
//		int n = 5;
//		int[] num = new int[n];
//		int max = num[0];
//
//		for (int i = 0; i < n; i++) {
//			num[i] = s.nextInt();
//		}
//		System.out.println(n + max);
	}
}
