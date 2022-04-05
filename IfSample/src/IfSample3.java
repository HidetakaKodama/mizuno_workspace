
public class IfSample3 {
	public static void main(String[] args) {
		String weather = "晴れ";

		if (weather.equals("晴れ")) {
			System.out.println("外で干す");
		} else if (weather.equals("曇り")) {
			System.out.println("保留");
		} else if (weather.equals("雨")) {
			System.out.println("部屋で干す");
		}

		System.out.println("終了します");
  }
}
