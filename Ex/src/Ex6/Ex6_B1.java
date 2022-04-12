package Ex6;

public class Ex6_B1 {
	public static void main(String[] args) {
		rectangle1(3);
		rectangle2(5);
	}

	public static void rectangle1(int v) {
		for (int i = 0; i < v; i++) {
			System.out.print("*");

		}
	}
	public static void rectangle2(int b) {
		for (int j = 0; j < b; j++) {
				System.out.println("*");
	}
		System.out.println();
	}

}
//		int vertical = 5;
//		int beside = 3;
//		int rectangle = add(vertical,beside);
//		System.out.print("*");
//	}
//
//	public static int add(int vertical) {
//		for (int i =0; i < vertical; i++) {
//			int sam = vertical;
//			return sam;
//	}
//}
//}