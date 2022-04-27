package ex3;

import java.util.HashMap;
import java.util.Scanner;
public class ListEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = sc.next();

		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "ねこ");
		map.put(2, "いぬ");
		map.put(3, "うさぎ");
		map.put(4, "くま");

		if(i.equals("cat")) {
			String animal = map.get(1);
			System.out.println(animal);
		} else if(i.equals("dog")) {
			String animal = map.get(2);
			System.out.println(animal);
		} else if(i.equals("rabbit")) {
			String animal = map.get(3);
			System.out.println(animal);
		} else if(i.equals("bear")) {
			String animal = map.get(4);
			System.out.println(animal);
		}
	}
}
