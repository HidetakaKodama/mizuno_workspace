package Ex_Fantasy2_A4;

public class FantasyNovelMain {
	public static void main(String[] args) {
		Book b = new Book("本","日本語");
		b.bookInfo();

		FantasyNovel f = new FantasyNovel("本","日本語",1939);
		f.bookInfo();
	}
}
