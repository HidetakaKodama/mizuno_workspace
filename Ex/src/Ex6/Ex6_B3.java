package Ex6;

/**
 *
 * 年数を引数とし、それが明治時代(1868～1912)ならばtrue、それ以外ならfalse
 * @author WEBEDGE
 *
 */


public class Ex6_B3 {
	public static void main(String[] args) {
	int m = 1860;
	int a = meiji(m);
	System.out.print("入力した文字：" + a);
}

	public static int meiji(int m) {
		int i = m;
		boolean r = (i < 1912) && (1868 < i);
		if(r) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		return i;
	}
}