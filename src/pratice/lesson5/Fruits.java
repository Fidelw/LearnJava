package pratice.lesson5;

public class Fruits {

	/**
	 * @param args
	 */
	public  double weight=77;
	public  String color="red";
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void info(){
		System.out.println("I am a fruit,my weight is "+weight);
	}
}
