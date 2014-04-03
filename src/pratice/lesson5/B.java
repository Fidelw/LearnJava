package pratice.lesson5;

class A{
	int i = 1;

	public void printI() {
		System.out.println("i=" + i);
	}
}

public class B extends A {
	public int i = 2;

	public void printI() {
		System.out.println("i=" + i);
	}

	public static void main(String[] args) {
		B b = new B();
		b.printI();

	}
}