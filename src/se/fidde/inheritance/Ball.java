package se.fidde.inheritance;

public class Ball {
	public void bounce() {
		System.out.println(String.format("bounce: %s", this.getClass().getName()));
	}
}
