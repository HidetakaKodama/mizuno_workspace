package Ex_Warikan2_A1;

public class Warikan {
	private int menu1;
	private int menu2;
	private int menu3;
	private int ppl;

	public int getMenu1() {
		return this.menu1;
	}

	public void setMenu1(int menu1) {
		this.menu1 = menu1;
	}

	public int getMenu2() {
		return this.menu2;
	}

	public void setMenu2(int menu2) {
		this.menu2 = menu2;
	}

	public int getMenu3() {
		return this.menu3;
	}

	public void setMenu3(int menu3) {
		this.menu3 = menu3;
	}

	public int getppl() {
		return this.ppl;
	}

	public void setppl(int ppl) {
		this.ppl = ppl;
	}


	public void getAverage() {
		int sum = 0;
		sum += this.getMenu1();
		sum += this.getMenu2();
		sum += this.getMenu3();

		int average = sum / this.getppl();
		System.out.println(ppl + "人で割勘にした場合、一人当たりの金額は" + average + "円（小数点以下切り捨て）です。");
	}
}
