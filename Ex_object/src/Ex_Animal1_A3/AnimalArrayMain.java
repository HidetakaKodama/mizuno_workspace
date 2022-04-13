package Ex_Animal1_A3;

public class AnimalArrayMain {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Animal("猫", 45);
		a[1] = new Animal("ラクダ",200);
		a[2] = new Animal("象",330);
		a[3] = new Animal("ネズミ",20);
		a[4] = new Animal("うさぎ",37);

		for (int i = 0; i < a.length; i++) {
			a[i].info();
		}
	}
}