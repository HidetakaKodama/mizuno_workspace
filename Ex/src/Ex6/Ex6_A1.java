package Ex6;

public class Ex6_A1 {
	public static void main(String[] args) {
		introduce("鈴木",20,55.5);
		introduce("山田",45,65.8);
		introduce("佐藤",30,46.1);
	}
	public static void introduce(String name,int age, double weight) {
		System.out.println( name + "さんは" + age + "歳、体重は" + weight + "kgです。");
	}
}
