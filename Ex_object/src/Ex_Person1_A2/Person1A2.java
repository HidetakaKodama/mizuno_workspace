package Ex_Person1_A2;

public class Person1A2 {
	String name;
	int age;

	Person1A2 (String name, int age){
		this.name = name;
		this.age = age;
	}

	void introduce() {
		System.out.println("私は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "歳です。");
	}

	void getOlder(int years) {
		age += years;
		System.out.println("【" + years + "年後】");
	}
}
