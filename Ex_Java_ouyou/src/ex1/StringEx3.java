package ex1;

import java.util.Scanner;

public class StringEx3 {
	public static void main(String[] args) {
		String num = null;
        Scanner s = new Scanner(System.in);

		while(true) {
		  num = s.nextLine();
		  if(num.equals("end")) {
			  System.out.println("終了します");
			  break;
		  }
			System.out.println(num);
		}
		s.close();
	}
}
