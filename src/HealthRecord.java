package app;

public class HealthRecord {
	
	private double height;
	private double weight;
	private String allergies;
	private String currentMedications;
	private String comments;
	
	// Constructor
	
	public HealthRecord() {}
	
	public HealthRecord(double height, double weight, String allergies, String currentMedications, String comments) {
		this.height = height;
		this.weight = weight;
		this.allergies = allergies;
		this.currentMedications = currentMedications;
		this.comments = comments;
	}

	// Getters and Setters
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getCurrentMedications() {
		return currentMedications;
	}

	public void setCurrentMedications(String currentMedications) {
		this.currentMedications = currentMedications;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	// To String
	
	@Override
	public String toString() {
		return "Height: " + height + "\nWeight: " + weight + "\nAllergies: "
				+ allergies + "\nCurrentMedications: " + currentMedications + "\nComments: " + comments;
	}

}
