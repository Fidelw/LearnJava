package pratice.lesson7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection books = new TreeSet();
		TestR A = new TestR(1);
		TestR B = new TestR(2);
		TestR C = new TestR(-8);
		TestR D = new TestR(-9);
		
		books.add(A);
		books.add(B);
		books.add(C);
		books.add(D);
		System.out.println(books);
		
		books.remove(new TestR(3));
		System.out.println(books);
		books.add(new TestR(1));
		System.out.println(books);

		// books.add("J2EE 轻量应用实战");
		// books.add("Structs2 权威指南");
		// books.add("J2EE AJAX指南");

		//
		// Iterator it= books.iterator();
		// while(it.hasNext()){
		// String book=(String)it.next();
		// System.out.println(book);
		// System.out.println(book.hashCode());
		//
		// if(book.equals("Structs2 权威指南")){
		// it.remove();
		// //books.remove(book); 遍历时不能改变collection对象，否则引发异常
		// }
		// book="测试字符串";
		// }
		// System.out.println(books);

	}

}
