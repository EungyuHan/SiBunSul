package app;

import java.util.ArrayList;

public class Member {

	private String name;
	private String address;
	private String email;
	private String phone;
	private String trainerName;
	private ArrayList<PTrecord> ptRecord;
	private HealthRecord healthRecord;
	
	// Constructor
	
	public Member() {}
	
	public Member(String name, String address, String email, String phone,String trainerName, ArrayList<PTrecord> pt, HealthRecord hlthr) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.trainerName = trainerName;
		this.ptRecord = pt;
		this.healthRecord = hlthr;
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
	public ArrayList<PTrecord> getPtRecord() {
		return ptRecord;
	}
	public void setPtRecord(ArrayList<PTrecord> ptRecord) {
		this.ptRecord = ptRecord;
	}
	public HealthRecord getHealthRecord() {
		return healthRecord;
	}
	public void setHealthRecord(HealthRecord healthRecord) {
		this.healthRecord = healthRecord;
	}
	
	// Methods
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", address=" + address + ", email=" + email +
				", phone=" + phone+", trainerName="+trainerName+  "]\n";
	}
	
}
