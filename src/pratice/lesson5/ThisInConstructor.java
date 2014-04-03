package pratice.lesson5;

public class ThisInConstructor {
	public int foo;
	
	public ThisInConstructor(){
		int foo=0;
		this.foo=6; //使用this 调用被覆盖的同名类属性
	}
	
	public static void main(String args[]){
		System.out.println(new ThisInConstructor().foo);
	}
}
