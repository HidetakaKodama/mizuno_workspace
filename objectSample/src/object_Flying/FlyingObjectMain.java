package object_Flying;

public class FlyingObjectMain {
	public static void main(String[] args) {
		FlyingObject fo1 = new AirPlane();
		FlyingObject fo2 = new Helicopter();

		execute(fo1);
		execute(fo2);
	}

	private static void execute(FlyingObject fo) {
		fo.fly();
	}
}
