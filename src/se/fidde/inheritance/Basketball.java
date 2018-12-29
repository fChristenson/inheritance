package se.fidde.inheritance;

public class Basketball extends Ball {
	@Override
	public void bounce() {
		System.out.println(String.format("dribble: %s", this.getClass().getName()));
	}
}
