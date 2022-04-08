package Ex5;

public class Ex5_B2 {
	public static void main(String[] args) {
		String [][] shop;
		shop = new String [4][4];

		shop[0][0] = " "; shop[0][1] = "卵"; shop[0][2] = "牛乳"; shop[0][3] = "キャベツ";
		shop[1][0] = "スーパー1"; shop[1][1] = "100円"; shop[1][2] = "150円"; shop[1][3] = "200円";
		shop[2][0] = "スーパー2"; shop[2][1] = "200円"; shop[2][2] = "110円"; shop[2][3] = "250円";
		shop[3][0] = "スーパー3"; shop[3][1] = "250円"; shop[3][2] = "160円"; shop[3][3] = "150円";

		for (int i = 0; i < 4; i++) {
			System.out.print(shop[i][3] + "\n" + shop[i][3]);
		}
	}
}
