package app;

import app.Entity.Member;
import app.Entity.PTrecord;
import app.Entity.Trainer;

import java.util.ArrayList;

public class Data {
	private static String password = "1234";
	public static String getPassword(){
		return password;
	}
	public static ArrayList<Trainer> trainerList = new ArrayList<>();

	public static ArrayList<Member> memberList = new ArrayList<>();
	public static void setPassword(String password){
		Data.password = password;
	}
}
