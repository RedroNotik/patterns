import models.*;

public class Main {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFly();
		Monok monok = new DuckMonok();
		monok.performSound();
	}
}