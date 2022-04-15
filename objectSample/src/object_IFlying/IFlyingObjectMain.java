package object_IFlying;

public class IFlyingObjectMain {
	public static void main(String[] args) {
		IFlyingObject fo1 = new AirPlaneIF();
		IFlyingObject fo2 = new HelicopterIF();

		fo1.fly();
		fo2.fly();
	}
}
