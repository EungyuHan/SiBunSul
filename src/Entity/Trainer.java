package app.Entity;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private String address;
    private String email;
    private String phone;
    private ArrayList<Member> memberList;

    public Trainer() {}
    public Trainer(String name, String address, String email, String phone, ArrayList<Member> memberList) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.memberList = memberList;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public String toString() {
        return "Trainer Name: " + name + "Address: " + address + "Email: " + email + "Phone: " + phone;
    }
}
