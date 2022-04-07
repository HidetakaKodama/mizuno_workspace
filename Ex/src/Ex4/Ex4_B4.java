package Ex4;

import java.util.Scanner;

public class Ex4_B4 {

		private static String fizzbuzz(int num) {

		    if (num % 5 == 0 && num % 3 == 0) return "FizzBuzz";
		    if (num % 5 == 0 ) return "Buzz";
		    if (num % 3 == 0) return "Fizz";

		    return Integer.toString(num);
		}

		  public static void main(String[] args) {


			  System.out.print("入力された数字: ");
			    Scanner input = new Scanner(System.in);
			    int targetNumber = input.nextInt();

		    for (int i = 1; i<=targetNumber; i++) {
		      System.out.println(fizzbuzz(i));
		      }
		  }
}

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int t = s.nextInt();
//		System.out.println("入力された数字: " + t);
//		s.close();
//
//		for (int i = 1; i <= t; i++) {
//			System.out.print(fizzbuzz(i));
//		}
//	}
//
//	private static String fizzbuzz(int num) {
//		if((num % 3 == 0) && (num % 5 == 0)) {
//			return "FizzBuzz";
//		} else if (num % 3 == 0){
//			return "Fizz";
//		} else if (num % 5 == 0) {
//			return "Buzz";
//		} else {
//			return Integer.toString(num);
//		}
//	}
//}





//		int i;
//		Scanner s = new Scanner(System.in);
//		i = s.nextInt();
//
//		for(int c = 1; c <= 40; c++) {
//
//		if((i % 3 == 0) && (i % 5 == 0)) {
//			System.out.println("FizzBuzz");
//		} else if (i % 3 == 0) {
//			System.out.println("Fizz");
//		} else if (i % 5 == 0) {
//			System.out.println("Buzz");
//		} else {
//			System.out.println(i);
//		}
//	}

