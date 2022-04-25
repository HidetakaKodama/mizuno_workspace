package ListSample;

import java.util.ArrayList;
public class ListSample4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);

		for(int num: list) {
			System.out.println(num);
		}
	}
}
