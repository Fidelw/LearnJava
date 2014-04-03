package pratice.lesson6;

public class AccessStaticInnerClass {

	static class innerclass {
		private static int i = 5;
		public static int b=4;
	}

	public static void test() {
		System.out.println(innerclass.i);
	}

	public static void main(String[] args) {
		AccessStaticInnerClass.test();
		System.out.println(AccessStaticInnerClass.innerclass.i);
	}
}
