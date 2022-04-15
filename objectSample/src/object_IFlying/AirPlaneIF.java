package object_IFlying;

public class AirPlaneIF implements IFlyingObject{
	@Override
	public void fly() {
		System.out.println("エンジンと翼で飛びます");
	}
}
