package object_Throws;

public class ThrowsSample1 {
	public static void main(String[] args) {
		System.out.println("mainを開始します");
		try {
			sleep();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("mainを終了します");
	}
	static void sleep() throws InterruptedException {
		System.out.println("メソッドを開始します");
		Thread.sleep(3000);
		System.out.println("メソッドを終了します");
	}
}
