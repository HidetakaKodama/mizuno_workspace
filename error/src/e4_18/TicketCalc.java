package e4_18;
/**
 * static修飾子
 * @author WEBEDGE
 *
 */
public class TicketCalc {
	static int basic;
	static int age;

	void ticket() {
		System.out.println("チケットの基本額を入力してください:" + basic + "円");
		System.out.println("年齢を入力してください:" + age + "歳");
		if(age <= 15) {
			basic -= 500;
			System.out.println("チケット代は" + basic + "円です。");
		} else if(25 <= age) {
			basic += 500;
			System.out.println("チケット代は" + basic + "円です。");
		} else {
			System.out.println("チケット代は" + basic + "円です。");
		}
	}
}

/*

 エラーコード
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	型 TicketCalc の非 static メソッド ticket() を static 参照することはできません

	at e4_18.TicketCalcMain.main(TicketCalcMain.java:11)


エラー内容
自クラス内のstaticでないメソッドやフィールド変数、クラス内クラスを参照することができない。


解決方法
7行目を、
static void ticket()
にする。staticメンバにして、インスタンスに紐づける。


 */
