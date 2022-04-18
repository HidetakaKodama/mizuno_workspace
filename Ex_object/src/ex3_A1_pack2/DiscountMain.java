package ex3_A1_pack2;
import ex3_A1_pack1.Discount;

public class DiscountMain {
	public static void main(String[] args) {
		Discount d = new Discount("パソコンブック",25600);
		d.Info();
		d.cutIn(3000);
		d.Info();
	}
}
