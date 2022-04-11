package e4_8;

/**
 *
 * 2つの整数を引数とし、その平均値を戻り値として返すメゾット
 *
 * @author WEBEDGE
 *
 */

public class Ex6_A2 {
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 70;
		double result = add(num1,num2);
		System.out.println("平均は" + result + "です。");
	}

	public static double add (int x, int y) {
		double sum = (double)(x + y) / 2;
		return sum;
	}
}

/*
エラーコード
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
型の不一致: double から int には変換できません

at e4_8.Ex6_A2.add(Ex6_A2.java:13)
at e4_8.Ex6_A2.main(Ex6_A2.java:7)

エラー内容
doubleからintには変換できない。

解決方法
メソッドは型を一致させることが重要な為、
しっかり揃える。
今回は19行目を
public static double add (int x, int y)
にする。


*/