package e4_19;

public class StudentOLMain {
	public static void main(String[] args) {
		StudentOL std1 = new StudentOL();
		std1.id = 1001;
		std1.name = "山田太郎";
		StudentOL std2 = new StudentOL(1002);
		std1.introduce();
		std2.introduce();
	}
}

/*
エラーコード
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	コンストラクター StudentOL() は未定義です

	at e4_19.StudentOLMain.main(StudentOLMain.java:5)

エラー内容
new StudentOL()を行うには引数のないStudentOL()を用意しないといけないが、
StudentOL(int id,String name)しか存在しない。

解決方法
1,引数なしのコンストラクタを作る。
2,5行目をnew StudentOL(1001,"山田太郎")と合わせる。
*/