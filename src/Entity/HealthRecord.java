package app.Entity;

public class HealthRecord {
	
	private double height;
	private double weight;
	private double mass;
	private double fat;
	private String comments;
	
	// Constructor
	
	public HealthRecord() {}
	
	public HealthRecord(double height, double weight, double mass, double fat, String comments) {
		this.height = height;
		this.weight = weight;
		this.mass = mass;
		this.fat = fat;
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

	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		this.fat = fat;
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
		return "Height: " + height + "\nWeight: " + weight + "\nMass: "
				+ mass + "\nFat: " + fat + "\nComments: " + comments;
	}

}
