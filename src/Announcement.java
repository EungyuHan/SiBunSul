package app;

public class Announcement {
	
	private String timestamp;
	private String content;
	
	// Constructor
	
	public Announcement() {}
	
	public Announcement(String timestamp, String content) {
		this.timestamp = timestamp;
		this.content = content;
	}
	
	// Getters and Setters

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	// To String

	@Override
	public String toString() {
		return "Announcement [timestamp=" + timestamp
				+ ", content=" + content + "]";
	}	

}
