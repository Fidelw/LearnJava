package pratice.lesson5;

public class Dog {

	public void jump() {
		System.out.println("executing methond jump");
	}

	public void run() {

		this.jump();
		System.out.println("executing methond run");

	}

}
