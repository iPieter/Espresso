package espresso;

public enum Month {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	
	public String toData() {
		switch (this) {
		case JANUARY: 
			return "01";
		case FEBRUARY:
			return "02";
			default: return "00";
		}
	}
	
}
