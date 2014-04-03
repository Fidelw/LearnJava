package pratice.lesson6;

public  class Sharp {
	private String color;

	public  double calPerimeters(){
		System.out.print("Sharp类的calPerimeters;");
		return 2.2d;
	}


	public  String getType(){
		System.out.print("Sharp类的getType;");
		return "123";
	}

	public Sharp() {

	}

	public Sharp(String color) {
		this.color=color;
		System.out.print("Sharp类的构造器在运行;");
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

class Triangle extends Sharp {

	private int a, b, c;

	public Triangle() {

	}

	public Triangle(String color, int a, int b, int c) {
		super(color);
		this.setSides(a, b, c);

	}

	public void setSides(int a, int b, int c) {
		if (a >= b + c && b >= a + c && c >= a + b) {
			System.out.print("三角形的两边之和必须大于第三边");
			return;
		}
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public double calPerimeters() {
		return a + b + c;
	}

	public String getType() {
		return "三角形";
	}
}