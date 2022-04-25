package ex3;

import java.util.ArrayList;
import java.util.Scanner;
public class ListEx4 {
	private static ArrayList scanNumbers() {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		ArrayList numbers = new ArrayList();

		for(int i = 0; i < values.length; i++) {
			try {
				int value = Integer.parseInt(values[i]);
				numbers.add(value);
			} catch (NumberFormatException ex) {
				return null;
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		ArrayList numbers;
	}
}
