package Ex_Person;

public class Person1A1Main {
	public static void main(String[] args) {
		//名前、年齢
		Person1A1 p = new Person1A1();

		p.name = "山田太郎";
		p.age = 15;

		p.introduce();

		//何年後か

//		p.name = "山田太郎";
		p.getOlder(15);
		p.introduce();


		//飲酒できるかどう
		p.alcohol();
	}
}
