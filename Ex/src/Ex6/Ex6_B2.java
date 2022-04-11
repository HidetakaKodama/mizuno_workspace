package Ex6;

public class Ex6_B2 {
	public static void main(String[] args) {
		int x;
		int y;
		if (numArray[0] > numArray[1]) {
			x = numArray[0];
			y = numArray[1];
		} else {
			x = numArray[1];
			y = numArray[0];
		}

		int tmp;
		while ((tmp = x % y) ! = 0) {
			x = y;
			y = tmp;
		}

		System.out.println(y);
	}

	private static String[] getSplitLine(Syring line) {
		return line.split("\\s");
	}

	private static int[] parseInt(String[] line) {
		int[] numArray = new int[line.length];
		for (int i= 0; i < line.length; i++) {
				numArray[i] = Integer.parseInt(line[i]);
		}
		return numArray;
	}
}
