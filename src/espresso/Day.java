package espresso;

public enum Day {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
	
	private int order;
	
	Day(int order) {
		this.order = order;
	}
	
	public int getOrder() {
		return this.order;
	}
	
}
