package Ex6;

public class Ex6_A5 {
	public static void main(String[] args) {
		int num = 100;
		System.out.println("入力した数字：" + num);
		int result = add(num);
		System.out.println("1から"+ num + "の和は" + result + "です。");
	}

	public static int add (int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
