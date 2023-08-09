package app;

import java.util.ArrayList;

public class AllVariables {
	
	// ***************************** Sample Data Set *****************************
	
	public HealthRecord health1 = new HealthRecord(1.80, 75.0, "Seafood", "Advil", "current broken left wrist, two previous concussions");
	public HealthRecord health2 = new HealthRecord(1.70, 70.0, "Lactose Intolerance", "Paracetamol", "history of migranes");
	public HealthRecord health3 = new HealthRecord(1.65, 60.0, "Eggs", "Aspirin", "recent heart surgury");
	public HealthRecord health4 = new HealthRecord(1.85, 80.0, "Gluten Free", "None", "None");
	public HealthRecord health5 = new HealthRecord(1.75, 75.0, "none", "Aspirin", "weak shoulders");
	
	public SwimTimeEntry timeEntry13 = new SwimTimeEntry("Hugh", "200 IM", "2.15.05", "02-16-2020", "Principia College");
	public SwimTimeEntry timeEntry12 = new SwimTimeEntry("Ava", "200 FR", "1.47.05", "02-16-2020", "Principia College");
	public SwimTimeEntry timeEntry11 = new SwimTimeEntry("Finn", "200 FL", "2.15.09", "02-15-2020", "Principia College");
	public SwimTimeEntry timeEntry10 = new SwimTimeEntry("Izzie", "50 FR", "24.67", "02-15-2020", "Principia College");
	public SwimTimeEntry timeEntry9 = new SwimTimeEntry("Blue", "200 BR", "2.45.85", "02-14-2020", "Principia College");
	public SwimTimeEntry timeEntry8 = new SwimTimeEntry("Mario", "100 FR", "1.02.93", "01-28-2020", "Loras College");
	public SwimTimeEntry timeEntry7 = new SwimTimeEntry("Varian", "100 BK", "1.54.36", "01-28-2020", "Home");
	public SwimTimeEntry timeEntry6 = new SwimTimeEntry("Paula", "200 FR", "1.58.23", "12-31-2019", "Florida");
	public SwimTimeEntry timeEntry5 = new SwimTimeEntry("Hugh", "50 FR", "21.06", "11-13-2019", "Coe College");
	public SwimTimeEntry timeEntry4 = new SwimTimeEntry("Alex", "100 BR", "1.13.05", "11-13-2019", "Coe College");
	public SwimTimeEntry timeEntry2 = new SwimTimeEntry("Zamin", "200 IM", "2.47.05", "11-07-2019", "Macalester College");
	public SwimTimeEntry timeEntry1 = new SwimTimeEntry("Eleanor", "100 FL", "57.43", "11-07-2019", "Macalester College");
			
	public ArrayList<SwimTimeEntry> timeRecordAll = new ArrayList<SwimTimeEntry>();

	public ArrayList<SwimTimeEntry> timeRecordSample = new ArrayList<SwimTimeEntry>();
	
	public Swimmer sw1 = new Swimmer("Claus", "Miller 137", "claus@luther.edu", "720-222-4444", "3.5", "Psychology", "SO", timeRecordSample, health1);
	public Swimmer sw2 = new Swimmer("Blue", "Brandt 007", "blue@luther.edu", "720-111-7777", "3.9", "Chemistry", "FY", timeRecordSample, health3);
	public Swimmer sw3 = new Swimmer("Zamin", "Sust. House 004", "zamin@luther.edu", "720-333-4444", "4.0", "Physics", "JR", timeRecordSample, health5);
	public Swimmer sw4 = new Swimmer("Paula", "Larson 203", "paula@luther.edu", "720-222-9999", "2.0", "Psychology", "SO", timeRecordSample, health4);
	public Swimmer sw5 = new Swimmer("Eleanor", "Brandt 605", "eleanor@luther.edu", "720-111-4444", "1.8", "Maths", "SR", timeRecordSample, health1);
	public Swimmer sw6 = new Swimmer("Finn", "Farwell 590", "finn@luther.edu", "720-999-0000", "3.7", "CS", "SR", timeRecordSample, health2);
	public Swimmer sw7 = new Swimmer("Varian", "Ylvi 423", "varian@luther.edu", "720-222-666", "3.9", "Sociology", "FY", timeRecordSample, health1);
	public Swimmer sw8 = new Swimmer("Mario", "Ylvi 213", "mario@luther.edu", "720-333-4444", "2.8", "Psychology", "SO", timeRecordSample, health5);
	public Swimmer sw9 = new Swimmer("Izzie", "Olson 792", "izzie@luther.edu", "720-555-5555", "3.4", "Global Health", "JR", timeRecordSample, health2);
	public Swimmer sw10 = new Swimmer("Ava", "Apartment 306", "ava@luther.edu", "720-000-3333", "3.0", "Nursing", "JR", timeRecordSample, health1);
	public Swimmer sw11 = new Swimmer("Hugh", "Baker 005", "hugh@luther.edu", "720-888-4444", "2.3", "Biology", "JR", timeRecordSample, health4);
	public Swimmer sw12 = new Swimmer("Peter", "Off Campus", "peter@luther.edu", "720-222-5555", "4.0", "CS", "SR", timeRecordSample, health3);
	
	public ArrayList<Swimmer> Roster = new ArrayList<Swimmer>();
}
