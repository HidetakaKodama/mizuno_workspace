package e4_15;

/**
 * 継承とコントラスタについての問題
 * @author WEBEDGE
 *
 */

public class FantasyNovel{
	public int shohan;
	public FantasyNovel(String genre,String language,int shohan) {
	super(genre, language);
	this.shohan = shohan;
}
	public void bookInfo() {
		System.out.println("この" + genre + "の初版は" + shohan + "年に出版されました。");
	}
}

/*
 * エラーコード
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	コンストラクター Object(String, String) は未定義です
	genre を変数に解決できません

	at Ex_Fantasy2_A4.FantasyNovel.<init>(FantasyNovel.java:6)
	at Ex_Fantasy2_A4.FantasyNovelMain.main(FantasyNovelMain.java:8)
	
	エラー内容
	9行目に、継承するために必要なextendsキーワードがない。
	
	解決方法
	9行目に、「extends + 継承するクラス名」を記述する。
	クラスが増えてきたので、それぞれのクラスの役割をしっかり理解していきたい。
 */
