package com.myfirstproject;

public class MyDetails {
	
	String name;
	String studentFather;
	String studentMother;
	char gender;
	String DOB;
	double mobileNumber;
	String email;
	String address;
	String studentCollege;
	String city;
	String state;
	String country;
	int pincode;
	String bloodgroup;
	String religion;
	double height;
	float weight;
	String maritalStatus;
	String language;
	String hobby;
	String goal;
	String strength;
	String weakness;
	
	
	void studentName() {
		name = "Kavya";
		
	}

	void studentFather() {
		 studentFather = "Srinivasa Rao";
		
	}
	
	void studentMother() {
		studentMother = "Triveni";
		
	}
	
	void gender() {
		 gender = 'F';
	}
	void DOB() {
		 DOB = "27-05-2003";
	}
	
	void mobileNumber() {
		 mobileNumber = 9858938222d;
		
	}
	
	void email() {
		 email = "chandu@gmail.com";
	}
	
	void address() {
		 address = "Anupalem";
		
	}
	void studentCollege() {
		 studentCollege = "kits";
		
	}
	void city() {
		 city = "Guntur";
		
	}
	
	void state() {
		 state = "Andhara Pradesh";
	}
	void country() {
		country = "India";
	}
	
	void pincode() {
		pincode = 522413;
	}
	void bloodgroup() {
		 bloodgroup = "o+";
	}
	
	void religion() {
		 religion = "Hindu";
	}
	void height() {
		height = 5.3d;
		
	}
	void Weight() {
		weight = 45.5f;
	}
	void maritalStatus() {
		maritalStatus = "Unmarried";
	}
	void language() {
		 language= "Telugu";
	}
	void hobby() {
		hobby = "reading books";
	}
	void goal() {
		 goal = "To get a good job";
	}
	void strength() {
		 strength = "self motivator";
	}
	void weakness() {
		 weakness = "overthinker";
	}
	void displayDetails() {		
		System.out.println("studentname:"+name);
		System.out.println("studentFather:" +  studentFather);
		System.out.println("studentMother:" + studentMother);
		System.out.println("gender:" + gender);
		System.out.println("DOB:" + DOB);
		System.out.println("mobileNumber: " + "mobileNumber");
		System.out.println("email: " + email);
		System.out.println("address: " + address);
		System.out.println("studentCollege: " + studentCollege);
		System.out.println("city : " + city);
		System.out.println("state : " + state);
		System.out.println("country : " + country);
		System.out.println("pincode : " + pincode);
		System.out.println("bloodgroup : " + bloodgroup);
		System.out.println("religion : " + religion);
		System.out.println("height : " + height);
		System.out.println("weight : " + weight);
		System.out.println("maritalStatus : " + maritalStatus);
		System.out.println("language : " + language);
		System.out.println("hobby : " + hobby);
		System.out.println("goal : " + goal);
		System.out.println("strength : " + strength);
		System.out.println("weakness : " + weakness);
		
	}
	
	public static void main(String[] args) {
	
		MyDetails t1 = new MyDetails();
	
		t1.studentName();
		t1.studentFather();
		t1.studentMother();
		t1.gender();
		t1.DOB();
		t1.mobileNumber();
		t1.email();
		t1.address();
		t1.studentCollege();
		t1.city();
		t1.state();
		t1.country();
		t1.pincode();
		t1.bloodgroup();
		t1.religion();
		t1.height();
		t1.maritalStatus();
		t1.language();
		t1.hobby();
		t1.goal();
		t1.strength();
		t1.weakness();
		t1.displayDetails();
	}

}
