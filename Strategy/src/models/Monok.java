package models;

public abstract class Monok {
	QuackBehavior quackBehavior;

	public Monok() {
		System.out.println("You've caught monok");
	}

	public void performSound(){ quackBehavior.quack();}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
