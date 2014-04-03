package pratice.lesson6;

interface interfaceA{
	int PRO_A =5;
	void testA();
}

interface interfaceB{
	int PRO_B =6;
	void testB();
}

interface interfaceC extends interfaceA,interfaceB{
	int PRO_C=7;
	void testC();
}

public class TestInterfaceExtends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(interfaceC.PRO_A);
		System.out.println(interfaceC.PRO_B);
		System.out.println(interfaceC.PRO_C);

	}

}
