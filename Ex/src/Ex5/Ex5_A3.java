package Ex5;

public class Ex5_A3 {
	public static void main(String[] args) {
		int[] scores = {88,55,77,99,66};
		int intMax = calcMax(scores);

		System.out.println("最大値は" + intMax);
		}

	public static int calcMax(int[] array) {
		int intMax = array[0];

		for (int i = 1; i < array.length; i++) {
			if(intMax < array[i]) {
				intMax = array[i];
			}
		}
		return intMax;
	}
	}
