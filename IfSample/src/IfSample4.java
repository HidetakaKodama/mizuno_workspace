
public class IfSample4 {
	public static void main(String[] args) {
		boolean isNoLaundry = true;
		boolean isNoClothes = true;
		int num;
		if(isNoLaundry && isNoClothes) {
			num = 0;
		} else if (isNoLaundry || isNoClothes) {
			num = 1;
		} else {
			num = 2;
		}
		System.out.println("残りの家事は" + num + "です。");
	}
}
