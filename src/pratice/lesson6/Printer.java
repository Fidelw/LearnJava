package pratice.lesson6;

interface Product{
	int getProduceTime();
}

public class Printer implements Product,OutPut {
	private String[] printData=new String[MAX_CACHE_SIZE];
	private int dataNum=0;
	public void out(){
		while(dataNum>0){
			System.out.println("打印机打印"+printData[0]);
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
	public void getData(String msg){
		if(dataNum>MAX_CACHE_SIZE){
			System.out.println("输出队列已满，添加失败");
		}
		else{
			printData[dataNum++]=msg;
		}
	}
	public int getProduceTime(){
		return 45;
	}
	
	public static void main(String[] args){
		OutPut o = new Printer();
		o.getData("轻量级JAVA应用");
		o.getData("Struct实战指南");
		o.getData("ABC");

		o.out();
		o.getData("基于AJAX的应用宝典");
		o.getData("Ruby on rails");
		o.out();
		Product p=new Printer();
		System.out.println(p.getProduceTime());
		Object b=p;
		
	}
	
}
