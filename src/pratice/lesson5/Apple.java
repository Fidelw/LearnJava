package pratice.lesson5;

public class Apple extends Fruits {
	//public  double weight=87;

	public void info(){
		System.out.println("I am an apple,my weight is "+weight+"g,my color is "+color);

	}
	
	public void getsuperweight(){
		System.out.println(super.weight);

	}
	public static void main(String[] args){

		Apple a =new Apple();
		a.weight=98;
		a.getsuperweight();
		System.out.println(a.color);
		a.info();
		
	}
}
