package Ex5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_B1 {
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		int num = s.nextInt();

		int[] scores = {88,55,77,99,66};
		if(Arrays.asList(num).contains(88)){
			System.out.println("見つかりました");
		} else {
			System.out.println("見つかりませんでした");
		}

	}
}
