package Ex4;

public class Ex4_B2 {
	public static void main(String[] args) {

//		continueを使う場合
//		for (int i = 1; i <= 100; i++) {
//			if (i % 8 == 0) {
//				continue;
//			}
//			System.out.println(i);

//      continueを使わない場合
		for (int i = 1; i <= 100; i++) {
			if (i % 8 != 0) {
				System.out.println(i);
			}
		}
	}
}
