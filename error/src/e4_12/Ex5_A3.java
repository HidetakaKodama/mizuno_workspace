package e4_12;

/**
 * 最大値を表示するプログラム
 * @author WEBEDGE
 *
 */

public class Ex5_A3 {
	public static void main(String[] args) {
		int[] scores = {88,55,77,99,66};
		int intMax = max(scores);

		System.out.println("最大値は" + intMax);
		}

	public static int max(int[] array) {
		int intMax = array;

		for (int i = 1; i <= array.length; i++) {
			if(intMax < array[i]) {
				intMax = array[i];
			}
		}
		return intMax;
	}
	}

/*
 * エラーコード
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	型の不一致: int[] から int には変換できません

	at Ex5.Ex5_A3.max(Ex5_A3.java:12)
	at Ex5.Ex5_A3.main(Ex5_A3.java:6)

	エラー内容
	int[]からintに変換はできない。

	解決方法
    18行目のarrayを、array[0]にする。
    配列の最大値が0の場合もありうるので、初期化することが大事。
 */