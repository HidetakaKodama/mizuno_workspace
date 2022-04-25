package DBAccessSample;

public class DBAccessSample8 {
	public static void main(String[] args) {
		TraDao dao = new TraDao();
		int id = 1;
		int age = 23;
		int result = dao.updateAgeById(id,age);
		if(result == 1) {
			System.out.println("更新は成功しました");
		} else {
			System.out.println("更新は失敗しました");
		}
	}
}
