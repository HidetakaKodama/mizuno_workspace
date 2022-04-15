package object_Abstract;

public class AbstractFlyigObjectMain {
	public static void main(String[] args) {
		AbstractFlyingObject fo1 = new AirPlaneAB();
		AbstractFlyingObject fo2 = new HelicopterAB();
		fo1.fly();
		fo2.fly();
	}
}
