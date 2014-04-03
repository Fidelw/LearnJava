package pratice.lesson4;

public class num2Rmb {
	private String[] hanArray = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌",
			"玖" };
	private String[] unitArray = { "拾", "佰", "仟" };
	private String[] unit2Array = { "角","分" };

	private String[] divide(double num) {
		long zheng = (long) num;
		long xiao = Math.round((num - zheng) * 100);
		return new String[] { zheng + "", String.valueOf(xiao) };
	}

	private String toHanStr(String han) {
		String result = "";
		int numlen = han.length();
		for (int i = 0; i < numlen; i++) {
			int num = han.charAt(i) - 48;
			if (i != han.length() - 1 && num != 0) {
				result += hanArray[num] + unitArray[numlen - 2 - i];
			} else {
				result += hanArray[num];
			}
		}
		return result+"元";
	}
	
	private String tofenStr(String han) {
		String result = "";
		int numlen = han.length();
		for (int i = 0; i < numlen; i++) {
			int num = han.charAt(i) - 48;
			if ( num != 0) {
				result += hanArray[num] + unit2Array[i];
			} else {
				result += hanArray[num];
			}
		}
		return result;
	}

	public static void main(String args[]){
		num2Rmb a= new num2Rmb();
		String[] num=a.divide(1444.333);
		System.out.println(a.toHanStr(num[0])+a.tofenStr(num[1]));
	}
	
}
