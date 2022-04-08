package Ex6;

public class Ex6_A2 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 70;
		double result = add(num1,num2);
		System.out.println("平均は" + result + "です。");
	}

	public static double add (int x, int y) {
		double sum = (x + y) / 2;
		return sum;
	}
}
