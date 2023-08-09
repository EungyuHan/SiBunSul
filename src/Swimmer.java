package app;

import java.util.ArrayList;

public class Swimmer {

	private String name;
	private String address;
	private String email;
	private String phone;
	private String gpa;
	private String major;
	private String classYear;
	private ArrayList<SwimTimeEntry> swtr;
	private HealthRecord hlthr;
	
	// Constructor
	
	public Swimmer() {}
	
	public Swimmer(String name, String address, String email, String phone, String gpa, String major, String classYear, ArrayList<SwimTimeEntry> swtr, HealthRecord hlthr) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.gpa = gpa; 
		this.major = major;
		this.classYear = classYear;
		this.swtr = swtr;
		this.hlthr = hlthr;
	}
	
	// Setters & Getters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGpa() {
		return gpa;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClassYear() {
		return classYear;
	}
	public void setClassYear(String classYear) {
		this.classYear = classYear;
	}
	public ArrayList<SwimTimeEntry> getSwtr() {
		return swtr;
	}
	public void setSwtr(ArrayList<SwimTimeEntry> swtr) {
		this.swtr = swtr;
	}
	public HealthRecord getHlthr() {
		return hlthr;
	}
	public void setHlthr(HealthRecord hlthr) {
		this.hlthr = hlthr;
	}
	
	// Methods
	
	@Override
	public String toString() {
		return "Swimmer [name=" + name + ", address=" + address + ", email=" + email + ", phone=" + phone + ", gpa="
				+ gpa + ", major=" + major + ", classYear=" + classYear + ", swtr=" + swtr
				+ ", hlthr=" + hlthr + "]";
	}
	
}
