package se.fidde.inheritance;

public class Football extends Ball {

	public void kick() {
		System.out.println(String.format("kick: %s", this.getClass().getName()));
	}

}
