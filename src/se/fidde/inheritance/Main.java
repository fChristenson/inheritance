package se.fidde.inheritance;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Basketball basketball = new Basketball();
		Football football = new Football();

		bounceBall(ball);
		dribbleBall(basketball);
		kickBall(football);
	}
	
	private static void bounceBall(Ball ball) {
		ball.bounce();
	}
	
	private static void dribbleBall(Basketball ball) {
		ball.bounce();
	}
	
	private static void kickBall(Football ball) {
		ball.kick();
		ball.bounce();
	}
}
