package object_Throws;

public class ThrowsSamole2 {
	public static void main(String[] args) {
		System.out.println("mainを開始します");
		sleep();
		System.out.println("mainを終了します");
	}
	static void sleep() {
		System.out.println("メソッドを開始します");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("メソッドを終了します");
	}
}
