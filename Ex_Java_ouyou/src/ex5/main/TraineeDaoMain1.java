package ex5.main;

import java.util.Scanner;

import ex5.dao.TraineeDAO;
import ex5.entity.Trainee;
public class TraineeDaoMain1 {
	public static void main(String[] args) {
		TraineeDAO dao = new TraineeDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("研修生IDを入力してください。→");
		int inputId = sc.nextInt();
		int id = 1;
		Trainee trainee = dao.searchById(id);

		if(trainee != null) {
			System.out.println("研修生ID:" + trainee.getId() + "名前:" + trainee.getName() + "年齢:" + trainee.getAge() + "性別:" + trainee.getSex());
		}
	}
}
