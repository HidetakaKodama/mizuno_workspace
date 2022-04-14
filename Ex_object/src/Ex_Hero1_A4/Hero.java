package Ex_Hero1_A4;

public class Hero {
	void section() {
		System.out.println("敵に攻撃。");
	}

	String weapon;
	void action(String weapon) {
		System.out.println(weapon + "で敵に攻撃。");
	}

	void action(String weapon,int damage) {
		System.out.println(weapon + "で攻撃。敵に" + damage + "のダメージ！");
	}
}
