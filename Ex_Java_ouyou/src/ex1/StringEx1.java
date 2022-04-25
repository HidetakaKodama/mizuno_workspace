package ex1;

import java.io.File;
import java.util.Scanner;
public class StringEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		File f = new File(str);

		System.out.println("ファイルパス→" + str);

		String str2 = f.getName();

		System.out.println("「" + str2 + "」");
	}
}
