package Ex5;

public class Ex5_B2 {
	public static void main(String[] args) {
		int[][] food = new int [3][];

		System.out.print("            卵     牛乳   キャベツ");

		food[0] = new int[] {100,150,200};
		food[1] = new int[] {200,110,250};
		food[2] = new int[] {250,160,150};

		for (int i = 0; i < food.length; i++) {
			System.out.println("\n");
			System.out.print("スーパー" + (i + 1) + "  ");

			int sum = 0;

			for(int j = 0; j < food[i].length; j++) {
				System.out.print(food[i][j] + "円" + "   ");
				sum += food[i][j];
			}
		}

//		String [][] shop;
//		shop = new String [4][4];
//
//		shop[0][0] = " "; shop[0][1] = "卵"; shop[0][2] = "牛乳"; shop[0][3] = "キャベツ";
//		shop[1][0] = "スーパー1"; shop[1][1] = "100円"; shop[1][2] = "150円"; shop[1][3] = "200円";
//		shop[2][0] = "スーパー2"; shop[2][1] = "200円"; shop[2][2] = "110円"; shop[2][3] = "250円";
//		shop[3][0] = "スーパー3"; shop[3][1] = "250円"; shop[3][2] = "160円"; shop[3][3] = "150円";
//
//		for (int i = 0; i < 4; i++) {
//			System.out.print(shop[i][3] + "\n" + shop[i][3]);
//		}
	}
}
