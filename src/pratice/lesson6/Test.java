package pratice.lesson6;

public class Test {

	public static void CheckAnimals(Animals a) {
		if (a instanceof Pet) {
			if (a instanceof CatchMouse) {
				System.out.println("改动物是能捉耗子的宠物");
			} else {
				System.out.println("改动物是不能捉耗子的宠物");
			}

		} else {
			System.out.println("改动物不是宠物");

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animals t=new Birds();
//		Test.CheckAnimals(t);
		
		int num=12311;
		String s=String.valueOf(num);
		System.out.println(s);
		int o=Integer.parseInt(s);
		System.out.println(s);

	}

}
