package com.myfirstproject;

 class Mobiledetails {
	void showMobileDetails() {
		 
		System.out.println("Brand : Samsung");
		System.out.println("Model : Galaxy s24");
		System.out.println("Price : 75000");
	}
	 void buyMobile(double amount) {
		 System.out.println("Mobile purchased successfully!");
		 System.out.println("Amount paid : " + amount);
		 
	 }
	public static void main(String[] args) {
		 Mobiledetails t1 = new  Mobiledetails();
			  t1.showMobileDetails();
			  t1.buyMobile(75000);
			  
	}
			
}
