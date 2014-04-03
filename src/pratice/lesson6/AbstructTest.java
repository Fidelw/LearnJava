package pratice.lesson6;

public abstract class AbstructTest {
	private int i;
	public int j;

	public AbstructTest(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public abstract void info();
}

class abcd extends AbstructTest {
	private int k;

	public abcd(int k) {
		super(3, 4);
		this.k = k;
	}
	

	public void info() {
		System.out.println(j + k);
		System.out.println(super.getI());

	}

}