package pratice.lesson7;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books=new ArrayList();
		books.add(new String("JAVA EE轻量级实践"));
		books.add(new String("Structs 权威指南"));
		books.add(new String("基于AJAX的权威应用宝典"));
		books.add(new String("JAVA EE轻量级实践"));

		System.out.println(books);
		books.add(1,new String("ROR 敏捷开发最佳实践"));
		System.out.println(books);
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		books.remove(2);
		System.out.println(books);
		System.out.println(books.indexOf(new String("JAVA EE轻量级实践")));
		//通过调用eauals方法查找对象，并删除第一个匹配的对象
		System.out.println(books);
		books.remove(new String("JAVA EE轻量级实践"));
		System.out.println(books);

		books.set(1, new String("Structs 权威指南"));
		System.out.println(books);
		System.out.println(books.subList(1,3));


	}

}
