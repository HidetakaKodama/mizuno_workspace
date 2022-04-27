package ex3;

import java.util.ArrayList;
public class ListEx3 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("えび");
		array.add("甘えび");
		array.add("伊勢えび");
		array.add("桜えび");
		array.add("赤えび");

		System.out.println("え→ゑに置き換えます");

		array.set(0, "ゑび");
		array.set(1, "甘ゑび");
		array.set(2, "伊勢ゑび");
		array.set(3, "桜ゑび");
		array.set(4,"赤ゑび");

		for(int i = 0; i < array.size(); i++) {
			String ebi = array.get(i);
			System.out.println(ebi);
		}
	}
}
