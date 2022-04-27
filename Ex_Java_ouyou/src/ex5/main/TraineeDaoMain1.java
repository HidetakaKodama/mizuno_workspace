package ex5.main;

import java.util.Scanner;

import ex5.dao.TraineeDAO;
import ex5.entity.Trainee;

public class TraineeDaoMain1 {
	public static void main(String[] args) {
		TraineeDAO dao = new TraineeDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("研修生IDを入力してください");
		int id = sc.nextInt();
		Trainee trainee = dao.searchById(id);

		if(trainee != null) {
			System.out.println("研修生ID:" + trainee.getId() + "名前:" + trainee.getName() + "年齢:" + trainee.getAge() + "性別:" + trainee.getSex() + "会社ID:" + trainee.getCoId());
		} else {
			System.out.println("追加に失敗しました。");
		}


		System.out.println("この研修生情報を削除しますか？(1:はい 2:いいえ)");
		int sakuzyo = sc.nextInt();

			int result = dao.deleteById(id);
			if(result == 1){
}
		if(sakuzyo == 1) {
			System.out.println("削除は成功しました");

		}else{
			System.out.println("削除は失敗しました");
		}
	}
}
