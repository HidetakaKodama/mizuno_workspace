package e4_11;

/**
 *
 * int[] scores = {88,55,77,99,66}の要素のうち、
 * 値が70以上の要素のみ表示するプログラム。
 * @author WEBEDGE
 *
 */

public class Ex5_A1 {
	public static void main(String[] args) {
		int[] scores = {88,55,77,99,66};
		for (int i = 0; i < scores.length; i++) {
			if(scores > 70) {
				System.out.println(scors);
			}
		}
	}
}

/*
エラーコード
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
演算子 > は引数の型 int[], int で未定義です

at e4_11.Ex5_A1.main(Ex5_A1.java:15)

エラー内容
scoresが未定義である。


解決方法
15行目、16行目のscoresを、scores[i]にする。

*/