package ex3_A1_pack1;

public class Discount {
	private String product;
	private int price;

	public Discount(String product,int price){
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void Info() {
		System.out.println("これは" + product + "です。");
		System.out.println("値段は" + price + "円です。");
	}

	public void cutIn(int cut) {
		System.out.println("決算セールで" + cut +"円値引きされます。");

		price -= cut;
	}

}
