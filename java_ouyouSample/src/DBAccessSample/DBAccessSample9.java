package DBAccessSample;

public class DBAccessSample9 {
	public static void main(String[] args) {
		TraDao dao = new TraDao();
		int id = 21;
		int result = dao.deleteById(id);
		if(result == 1) {
			System.out.println("削除は成功しました");
		} else {
			System.out.println("削除は失敗しました");
		}
	}
}
