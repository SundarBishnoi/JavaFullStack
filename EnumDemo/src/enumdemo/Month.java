package enumdemo;

public enum Month {
	JAN(1,"Jan"),
	FEB(2,"Feb");

	private int monthIndex;
	private String monthName;
	private Month(int monthIndex, String monthName) {
		this.monthIndex = monthIndex;
		this.monthName = monthName;
	}
	public int getMonthIndex() {
		return monthIndex;
	}
	public void setMonthIndex(int monthIndex) {
		this.monthIndex = monthIndex;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
}
