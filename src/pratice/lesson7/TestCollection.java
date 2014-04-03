package pratice.lesson7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("孙悟空");
		c.add(6);
		System.out.println(c.size());
		c.remove(6);
		System.out.println(c.size());
		c.add("JAVA EE轻量级实践");
		System.out.println(c);
		Collection books=new HashSet();
		books.add("JAVA EE轻量级实践");
		books.add("Structs 权威指南");
		System.out.println(c.contains(books));
		c.removeAll(books);
		System.out.println(c.size());
		System.out.println(c);
		c.clear();
		System.out.println(c);
		books.retainAll(c);
		System.out.println(books);

	}

}
