package Ex_Cook2_A5;

public class CookingMain {
	public static void main(String[] args) {
		Cooking c1 = new Cooking();
		c1.foodstuff = ("じゃがいも");
		c1.ingredients();

		Cooking c3 = new Bake();
		execute(c3);

		Cooking c2 = new Cooking();
		c2.foodstuff = ("にんじん");
		c2.ingredients();

		Cooking c4 = new Boil();
        execute(c4);

	}

	private static void execute(Cooking c) {
		c.cook();
	}
}
