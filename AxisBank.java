package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		
		System.out.println("Money Deposited in Axis Bank");		

			}
	
/*
1.Above deposit method is available in both childclass(Axix Bank) and its parent class(Bank Info).
2.However, there is an implementation difference between the deposit method in AxisBank and BankInfo
3.If we are calling this method in child, it will give preference to the one in child and not parent
4.This is called Method Overriding.
*/
	
	public static void main(String[] args) {
		
		AxisBank Overriding = new AxisBank();
		Overriding.deposit();
		System.out.println(Overriding.saving("Money Saved"));
		Overriding.fixed("FD Account Opened");

	}

}
