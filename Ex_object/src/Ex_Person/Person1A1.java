package Ex_Person;

public class Person1A1 {

	    String name;
	    int age;

	    void introduce() {
	    	System.out.println("私は" + name + "です。");
	    	System.out.println("年齢は" + age + "歳です。");
	    }

		void getOlder(int years) {
			age = age + years;
			System.out.println("【" + years + "年後】");
//			System.out.println("私は" + name + "です。");
		}

		void alcohol() {;
			if (18 <= age) {
				System.out.println("飲酒できる年齢です。");
			} else {
				System.out.println("まだ飲酒できる年齢ではありません。");
			}
		}
}
//		String name;
//		int age;
//	    Person1A1(String name,int age){
//		    this.name = name;
//		    this.age = age;
//	}
//
//		void introduce() {
//			System.out.println("私は" + name + "です。");
//			System.out.println("年齢は" + age + "歳です。");
//		}
//
//		int years;
//		Person1A1(int years){
//			this.years = years;
//		}
//
//		void getOlder() {
//			System.out.println("【" + years + "年後】");
//		}
