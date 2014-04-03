package pratice.lesson5;

public class TestPrimitiveTranfer {
	public static void swap(int a,int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("the var in swap method is a="+a+",b="+b);
	}
	public static void main(String args[]){
		int a=3,b=5;
		System.out.println("the var in swap method is a="+a+",b="+b);

		swap(a,b);
		System.out.println("the var in main method is a="+a+",b="+b);

	}
}
