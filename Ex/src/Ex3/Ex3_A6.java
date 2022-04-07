package Ex3;

public class Ex3_A6 {
	public static void main(String[] args) {



//		for(int s = 1; s <= 5; s++) {
//			int bottom = 1; //底
//		    int index = 2; //指数
//		    int result = 1; //2乗の計算の解
//
//		for(int i = 1; i <= index; i++) {
//
//			result *= bottom;
//			bottom++;
//			result++;
//
//		}
//
//		System.out.println(result);

		int j = 1;

		for (int s = 0; s <= 5; s++) {
			for (int i = 1; i <= 5; i++) {
				j = j * i;

				 System.out.println(j);

			}
		}
	}
}
