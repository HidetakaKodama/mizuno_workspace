package Ex_ICooking;

public class ICookingMain {
	public static void main(String[] args) {
		ICooking c1 = new BoilIF();
		ICooking c2 = new BakeIF();

		c1.cook();
		c2.cook();
	}
}
