package ex1;

import java.util.Scanner;

public class StringEx2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		int index = str.indexOf("-");
		String result = str.substring(0,index);
		System.out.println("市外局番は「" + result + "」");
	}
}
