package ex3;

import java.util.ArrayList;
public class ListEx3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("えび");
		list.add("甘えび");
		list.add("伊勢えび");
		list.add("桜えび");
		list.add("赤えび");

		System.out.println("え→ゑに置き換えます");

		String str = list.replace("え","ゑ");
	}
}
