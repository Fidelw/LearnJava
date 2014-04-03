package pratice.lesson6;

public class Season {
	private String name;
	private String desc;
	public static final Season SPRING = new Season("春天", "趁春踏青");
	public static final Season SUMMER = new Season("夏天", "夏日炎炎");
	public static final Season AUTUMN = new Season("秋天", "秋高气爽");
	public static final Season WINTER = new Season("冬天", "围炉赏雪");

	public static Season getSeaon(int seasonNum) {
		switch (seasonNum) {
		case 1:
			return SPRING;
		case 2:
			return SUMMER;
		case 3:
			return AUTUMN;
		case 4:
			return WINTER;
		default:
			return null;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
}
