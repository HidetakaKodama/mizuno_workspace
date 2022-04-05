package Ex2;

public class Ex2_B1 {
	public static void main(String[] args) {
		int num1 = new java.util.Random().nextInt(100);
		int num2 = new java.util.Random().nextInt(100);

		System.out.println(num1);
		System.out.println(num2);

		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
}
