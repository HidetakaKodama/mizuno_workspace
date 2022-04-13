package e4_13;

/**
 * 1.Animal の配列を生成
 * 2.コンストラクタを利用してインスタンスを5つ生成し、
 * 　それぞれの配列の各要素を代入
 * 3.for文を利用し、配列の全要素の情報をinfoメソッドによって表示する。
 * @author WEBEDGE
 *
 */

public class AnimalArrayMain {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Animal("猫", 45);
		a[1] = new Animal("ラクダ",200);
		a[2] = new Animal("象",330);
		a[3] = new Animal("ネズミ",20);
		a[4] = new Animal("うさぎ",37);

		for (int i = 0; i < a.length; i++) {
			a[i].info();
		}
	}
}

/*
エラーコード
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
at Ex_Animal1_A3.AnimalArrayMain.main(AnimalArrayMain.java:10)

エラー内容
配列のインデックスが範囲外になっている

解決方法
14行目のAnimal[4]をAnimal[5]にする。
（5以上にした場合は
Exception in thread "main" java.lang.NullPointerException
	at e4_13.AnimalArrayMain.main(AnimalArrayMain.java:22)
	となる)

*/