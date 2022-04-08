package Ex6;

public class Ex6_A4 {
	public static void main(String[] args) {
		int num = 4000;
		System.out.println("元の値段は" + num + "円");
		double result = add(num);
		System.out.println("割引の値段は" + result + "円です。");
	}

	public static double add (int x) {
		if (x > 20000) {
			double sum = x * 0.6;
			return sum;
		} else if (x > 10000) {
			double sum = x * 0.8;
			return sum;
		} else if (x > 5000) {
			double sum = x * 0.9;
			return sum;
		} else {
		double sum = x;
		return sum;
	}
	}
}
