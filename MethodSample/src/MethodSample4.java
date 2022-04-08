
public class MethodSample4 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int result = add(x,y);
		System.out.println("値は" + result + "です");
	}
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
