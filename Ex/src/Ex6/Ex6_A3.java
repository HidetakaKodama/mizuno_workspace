package Ex6;

public class Ex6_A3 {
	public static void main(String[] args) {
		int num = 10000;
		System.out.println("元の値段は" + num + "円");
		double result = add(num);
		System.out.println("3割引の値段は" + result + "円です。");
	}

	public static double add(int x) {
		double sum = x * 0.7;
		return sum;
	}
}
