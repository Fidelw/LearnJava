package pratice.lesson7;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

enum Season {
	SPRING, SUMMER, FALL, WINTER
}

public class EnumSetDemo {
	public static void main(String[] args) {
		EnumSet es1=EnumSet.allOf(Season.class);
		System.out.println(es1);
		EnumSet es2=EnumSet.noneOf(Season.class);
		es2.add(Season.SPRING);
		es2.add(Season.FALL);
		es2.add(Season.SUMMER);
		System.out.println(es2);
		EnumSet es3=EnumSet.of(Season.SUMMER,Season.WINTER);
		System.out.println(es3);
		EnumSet es4=EnumSet.range(Season.SUMMER,Season.WINTER);
		System.out.println(es4);
		EnumSet es5=EnumSet.complementOf(es4);
		System.out.println(es5);
		
		Collection c=new HashSet();
		c.clear();
		c.add(Season.WINTER);
		c.add(Season.SPRING);
		EnumSet es6=EnumSet.copyOf(c);
		System.out.println(es6);

	}
}
