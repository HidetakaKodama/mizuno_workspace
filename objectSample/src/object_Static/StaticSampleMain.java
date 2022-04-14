package object_Static;

public class StaticSampleMain {
	public static void main(String[] args) {
		StaticSample.sField = 787;
		StaticSample.sMethod();

		StaticSample s = new StaticSample();
		s.iField = 128;
		s.iMethod();
	}
}
