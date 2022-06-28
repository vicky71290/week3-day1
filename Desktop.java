package week3.day1;

public class Desktop extends Computer {
	
	public void DesktopSize() {
		
		System.out.println("15 inch");
		
	}

	public static void main(String[] args) {

		Desktop SingleInh = new Desktop();
		System.out.println(SingleInh.ComputerModel("Hewlett Packard"));
		SingleInh.DesktopSize();
		
	}

}
