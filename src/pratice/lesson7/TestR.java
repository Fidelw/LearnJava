package pratice.lesson7;

public class TestR implements Comparable{
	int count;

	public TestR() {

	}

	public TestR(int count) {
		this.count = count;
	}
	
	public  String  toString(){
		 return "count的属性值="+this.count;
	}

	public boolean equals(Object obj) {
		if (obj instanceof TestR) {
			TestR r = (TestR) obj;
			if (this.count == r.count) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		return count;
	}
	
	public int compareTo(Object obj){
		if (obj instanceof TestR) {
			TestR r = (TestR) obj;
			if (this.count > r.count) {
				return 1;
			}
			else if(this.count ==r.count){
				return 0;
			}
		}
		return -1;
	}
}
