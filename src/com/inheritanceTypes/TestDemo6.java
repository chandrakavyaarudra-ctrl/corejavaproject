package com.inheritanceTypes;

class Notification {
	void sendNotification() {
		System.out.println("Notifiactions");
	}
}

class EmailNotification extends Notification {
	@Override
	void sendNotification() {
		System.out.println("EmailNotification");
	}
}

class SMSNotification extends Notification {
	
	@Override
	void sendNotification() {
		System.out.println("SMSNotification");
	}
}

class WhatsAppNotification extends Notification {
	@Override
	void sendNotification() {
		System.out.println("WhatsAppNotification:Hi");
	}
}

public class TestDemo6 {

	public static void main(String[] args) {
		Notification n = new Notification();
		Notification n1 = new EmailNotification();
		Notification n2 = new SMSNotification();

		Notification n3 = new WhatsAppNotification();

		n.sendNotification();
		n1.sendNotification();
		n2.sendNotification();
		n3.sendNotification();
	}

}
