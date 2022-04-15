package e4_14;

/**
 * 名前、年齢、体重を引数としたメソッドを利用し表示するプログラム
 * @author WEBEDGE
 *
 */

public class Ex6_A1 {
	public static void main(String[] args) {
		introduce("鈴木",20,55.5);
		introduce("山田",45,65.8);
		introduce("佐藤",30);
	}
	public static void introduce(String name,int age) {
		System.out.println( name + "さんは" + age + "歳、体重は測定していません。" );
	}

	public static void introduce(String name,int age,double weight) {
		System.out.println( name + "さんは" + age + "歳、体重は" + weight + "kgです。");
	}

}



/*
  エラーコード
  Exception in thread "main" java.lang.Error: Unresolved compilation problems:
	型 Ex6_A1 のメソッド introduce(String, int) は引数 (String, int, double) に適用できません
	型 Ex6_A1 のメソッド introduce(String, int) は引数 (String, int, double) に適用できません
	型 Ex6_A1 のメソッド introduce(String, int) は引数 (String, int, double) に適用できません

	at Ex6.Ex6_A1.main(Ex6_A1.java:5)

	エラー内容
	引数の中の体重がメソッドに適応できない。

	解決方法
	15行目のメソッドをしっかり書く。
	今回は
	(String name,int age, double weight)
 */
