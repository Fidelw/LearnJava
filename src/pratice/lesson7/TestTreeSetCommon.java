package pratice.lesson7;

import java.util.TreeSet;

public class TestTreeSetCommon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet num = new TreeSet();
		num.add(5);
		num.add(8);
		num.add(2);
		num.add(-1);
		System.out.println(num);
		System.out.println(num.first());
		System.out.println(num.last());
		System.out.println(num.headSet(7));
		System.out.println(num.tailSet(2));

	}

}
