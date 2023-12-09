package app.Entity;

public class PTrecord {
	
	private String year;
	private String month;
	private String day;
	private String memo;
	
	// Constructor
	
	public PTrecord() {}
	
	public PTrecord(String year, String month, String day, String memo) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.memo = memo;
	}
	
	// Setters & Getters
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMemo() {
		return "Memo: " + memo;
	}
	public String getDate() {
		return "PT :" + year + "/" + month + "/" + day;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}


	@Override
	public String toString() {
		return "PT : "+ month + "/" + day + "/" + year + "\nMemo: " + memo + "\n";
	}

}
