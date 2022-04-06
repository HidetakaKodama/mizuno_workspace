
public class Ex1_B2 {
	public static void main(String[] args) {
		int i1 = new java.util.Random().nextInt(100);
		int i2 = new java.util.Random().nextInt(100);

		int i3 = Math.max(i1, i2);

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
	}
}
