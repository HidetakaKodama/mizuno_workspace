package Ex_Person1_A2;

public class Person1A2Main {
	public static void main(String[] args) {
		Person1A2 p = new Person1A2("山田太郎",15);
		p.introduce();

		p.getOlder(15);
		p.introduce();
	}
}
