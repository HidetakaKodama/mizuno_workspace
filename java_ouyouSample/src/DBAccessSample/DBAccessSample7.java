package DBAccessSample;

public class DBAccessSample7 {
	public static void main(String[] args) {
		TraDao2 dao = new TraDao2();
		Trainee trainee = new Trainee();
		trainee.setId(21);
		trainee.setName("山田花子");
		trainee.setAge(22);
		trainee.setSex("女");
		int result = dao.insert(trainee);

		if(result == 1) {
			System.out.println("追加は成功しました");
		} else {
			System.out.println("追加は失敗しました");
		}
	}
}
