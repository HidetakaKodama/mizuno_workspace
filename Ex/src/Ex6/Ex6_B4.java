package Ex6;

/**
 * 整数の一次元配列を引数とし、その最大値を戻り値として返すメソッド
 * @author WEBEDGE
 *
 */

public class Ex6_B4 {
	public static void main(String[] args) {
		int[] array = {10,20,30};
		int max = maxOf(array);
		System.out.println(max);
	}
	static int maxOf(int[] a) {
		int max = a[0];
		for (int e:a)
			if(max < e)
				max = e;
		return max;
	}
	}
//		int[] data = {10,20,30};
//		int m = data [0];
//		System.out.print(m);
//	}
//
//	public static int m(int data[]) {
//		int m = Integer.MIN_VALUE;
//		for(int i = 0; i < data.length; i++) {
//			m = data[i] > m ? data[i] : m;
//		}
//		return m;
//	}
//}

//		int[] a = {20,30};
//		int getMax = a[0];
//		System.out.print(getMax);
//	}
//
//	public static int getMax(int[] a) {
//		int max = Integer.MIN_VALUE;
//		for(int i = 0; i < a.length; i++) {
//			max = Math.max(a[i],max);
//		}
//		return max;
//	}
//}

//		int[] a = {10,20,30};
//		int Max = a[0];
//		int Min = a[0];
//		System.out.print(Min);
//	}
//	public static int Max(int[] a) {
//		int Max = a[0];
//		int Min = a[0];
//		for(int i = 1; i < a.length; i++) {
//			if(Max < a[i]) {
//				Max = a[i];
//			} else if (Min > a[i]) {
//				Min = a[i];
//			}
//
//		}
//		return Min;
//	}
//}

//
//		int[] array = {10,20,30};
//		int maxNum = array[0];
//		System.out.print(maxNum);
//	}
//	public static int maxNum(int[] array) {
//		int maxNum = array[0];
//		for (int i :array) {
//			if (i > maxNum)
//				maxNum = i;
//		}
//		return maxNum;
//	}
//}



//		int num[] = {10,20,30};
//		a(num);
//		System.out.print(num);
//	}
//	public static int a(int num[]) {
//		int intMax = num[0];
//		for (int i = 1; i < num.length; i++) {
//			if (intMax < num[i]) {
//				intMax = num[i];
//			}
//		}
//		return intMax;
//	}
//}
