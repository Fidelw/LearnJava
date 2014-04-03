package pratice.lesson5;

public class OverLoad {
	public void test(){
	System.out.println("无参数");
	}
	public void test(String msg){
		System.out.println("有参数"+msg);

	}
	public static void main(String[] args){
		OverLoad ol=new OverLoad();
		ol.test();
		ol.test("1");
	}

}
