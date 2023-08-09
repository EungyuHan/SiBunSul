package app;

public class SwimTimeEntry {
	
	private String name;
	private String swimEvent;
	private String swimTime;
	private String swimDate;
	private String occasion;
	
	// Constructor
	
	public SwimTimeEntry() {}
	
	public SwimTimeEntry(String name, String swimEvent, String swimTime, String swimDate, String occasion) {
		this.name = name;
		this.swimEvent = swimEvent;
		this.swimTime = swimTime;
		this.swimDate = swimDate;
		this.occasion = occasion;
	}
	
	// Setters & Getters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSwimEvent() {
		return swimEvent;
	}

	public void setSwimEvent(String swimEvent) {
		this.swimEvent = swimEvent;
	}

	public String getSwimTime() {
		return swimTime;
	}

	public void setSwimTime(String swimTime) {
		this.swimTime = swimTime;
	}

	public String getSwimDate() {
		return swimDate;
	}

	public void setSwimDate(String swimDate) {
		this.swimDate = swimDate;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}
	
	// To String

	@Override
	public String toString() {
		return "Event: " + swimEvent + "\nTime: " + swimTime + "\nDate: "
				+ swimDate + "\nLocation: " + occasion + "\n\n";
	}

}
