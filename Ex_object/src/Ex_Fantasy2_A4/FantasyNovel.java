package Ex_Fantasy2_A4;

public class FantasyNovel extends Book{
	public int shohan;
	public FantasyNovel(String genre,String language,int shohan) {
	super(genre, language);
	this.shohan = shohan;
}
	public void bookInfo() {
		System.out.println("この" + genre + "の初版は" + shohan + "年に出版されました。");
	}
}
