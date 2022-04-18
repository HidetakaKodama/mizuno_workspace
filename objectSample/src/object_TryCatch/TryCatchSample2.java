package object_TryCatch;

public class TryCatchSample2 {
	public static void main(String[] args) {
		System.out.println("mainを開始します");
		try {
			int[] a = new int[3];
			System.out.println("値を代入します");
			a[3] = 30;

			System.out.println("処理を終了します");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		} finally {
			System.out.println("必ず行う処理");
		}
		System.out.println("mainを終了します");
	}
}
