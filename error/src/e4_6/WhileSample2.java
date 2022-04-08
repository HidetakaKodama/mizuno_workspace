package e4_6;

/**
 * 
 * @author WEBEDGE
 *
 */
public class WhileSample2 {
	public static void main(String[] args) {
		do {
			System.out.println(i);
			i++;
		} while(i < 3);
	}
}

/*

エラーコード
Exception in thread "main" java.lang.Error: Unresolved compilation problems:
	i を変数に解決できません
	i を変数に解決できません
	i を変数に解決できません

	at WhilSample1.main(WhilSample1.java:5)

エラー内容
変数iが定義されていないのでプログラムが動かない。

解決方法
変数に値を代入する前には必ず宣言を行う。
(int i = 0;)
*/