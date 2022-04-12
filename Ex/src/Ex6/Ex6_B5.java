package Ex6;

/**
 * 整数の一次元配列を引数とし、全要素の合計値を戻り値として返すメソッド
 * @author WEBEDGE
 *
 */

public class Ex6_B5 {
	public static void main(String[] args) {
		int[] array = {10,20,30};
		int sum = sumOf(array);
		System.out.println(sum);
	}
	public static int sumOf(int[] a) {
		int sum = 0;
		for (int e:a)
			sum += e;
		return sum;
	}
	}

//		int[] num = {10,20,30};
//		totalnum (num);
//	}
//	static void totalnum(int[] num) {
//		for (int i = 0; i < num.length; i++) {
//			int sum = 0;
//			sum += num[i];
//		}
//	}
//}

//	int num[] = {10,20,30};
//	int total = num[0];
//	System.out.print(total);
//}
//	public static int total(int num[]) {
//		int total = num[0];
//		for (int i = 0; i < num.length; i++) {
//			total = total + num[i];
//		}
//		return total;