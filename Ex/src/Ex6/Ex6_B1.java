package Ex6;

public class Ex6_B1 {
	public static void main(String[] args) {
		int rectangle = number(3,5);
		System.out.println();
	}

	public static int number(int num1,int num2) {
		for (int i = 0; i <= num1; i++) {
			for ( int j = 0; j <= num2; j++) {
				System.out.print("*");
			}
		}
	}
}
