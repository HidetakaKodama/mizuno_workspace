package Ex_Ticket1_A6;

public class TicketCalc {
	static int basic;
	static int age;

	static void ticket() {
		System.out.println("チケットの基本額を入力してください:" + basic + "円");
		System.out.println("年齢を入力してください:" + age + "歳");
		if(age <= 15) {
			basic -= 500;
			System.out.println("チケット代は" + basic + "円です。");
		} else if(25 <= age) {
			basic += 500;
			System.out.println("チケット代は" + basic + "円です。");
		} else {
			System.out.println("チケット代は" + basic + "円です。");
		}
	}
}
