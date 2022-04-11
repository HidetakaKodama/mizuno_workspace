package Ex5;

import java.util.Scanner;

public class Ex5_B1 {
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		int num = s.nextInt();

		int[] scores = {88,55,77,99,66};
		for(int j = 0; j < scores.length; j++) {
		for(int i = 0; i < 1; i++){
		if(scores[i] == num){
			System.out.println("見つかりました");
		} else {
			System.out.println("見つかりませんでした");
		}

	}
}
}
}
