package Ex_Hero1_A4;

public class HeroMain {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.section();

		h.action("石");
		h.action("弓",35);

		for(int i = 0; i < 3; i++) {
		h.action("剣",15);
	}
}
}