package pratice.lesson5;

class BaseClass {
	private int book;
	private String ok="12312312";

	public int getBook() {
		return book;
	}

	public void setBook(int book) {
		this.book = book;
	}

	public void base() {
		System.out.println("父类的普通方法");
	}

	public void test() {
		System.out.println("父类的被覆盖方法");
	}
}

public class SubClass extends BaseClass {
	public String book = "轻量级J2EE应用开发";

	public void test() {
		System.out.println("子类的覆盖父类方法");
	}

	public void sub() {
		System.out.println("子类的普通方法");

	}

	public static void main(String[] args) {
		BaseClass bc = new BaseClass();
		System.out.println(bc.getBook());
		bc.base();
		bc.test();
		SubClass sc=new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		sc.sub();
		BaseClass bc1=new SubClass();
		bc1.base();
		bc1.test();
		System.out.println(bc1.getBook());
		//SubClass c=(SubClass)bc1;
		((SubClass)bc1).sub();
		((SubClass)bc1).test();
		((SubClass)bc1).base();
		System.out.println(((SubClass)bc1).book);
		String a=new String("www");
		System.out.println(a.hashCode());
		a="我爱你";
		System.out.println(a.hashCode());

		

	}
}
