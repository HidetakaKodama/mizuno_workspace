package object_Abstract;

public class AirPlaneAB extends AbstractFlyingObject{
	@Override
	public void fly() {
		System.out.println("エンジンと翼で飛びます");
	}
}
