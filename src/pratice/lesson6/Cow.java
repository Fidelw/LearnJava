package pratice.lesson6;

public class Cow {
	private double weight;
	public Cow(){}
	public Cow(double weight){
		this.weight=weight;
	}
	private class CowLeg{
		private double length;
		private String color;
		public CowLeg(){}
		public CowLeg(double length,String color){
			this.length=length;
			this.color=color;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void info(){
			System.out.println("当前牛腿颜色是"+color+",高度是"+length);
			System.out.println("牛腿所在牛的重量是"+weight);
		}
	}
	public void test(){
		CowLeg cl=new CowLeg(1.12,"黑白相间");
		cl.info();
	}
	
	public static void main(String[] args){
		Cow c= new Cow(378.5);
		c.test();
	}
}
