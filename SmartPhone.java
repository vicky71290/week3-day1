package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsapp() {

		System.out.println("Whatsapp Connected");

	}

	public void takeVideo() {

		System.out.println("Taking the Video from Smart Phone");

	}

	public static void main(String[] args) {

		SmartPhone inheritance = new SmartPhone();
		inheritance.saveContactl();
		inheritance.makeCall();
		inheritance.sendMsg();
		inheritance.takeVideo();
		inheritance.connectWhatsapp();

	}

}
