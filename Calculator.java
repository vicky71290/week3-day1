package week3.day1;

public class Calculator {
	
	public void add(int a1, int a2) {
		
		System.out.println(a1+a2);
		
	}
	
	public int add(int a3, int a4, int a5) {
		
		return(a3+a4+a5);
		
	}
	
	public void sub(double s1, double s2) {
		
		System.out.println(s1-s2);
		
	}
	
	public void sub(int  s3, int s4) {
		
		System.out.println(s3-s4);
		
	}
	
	
public void mul(double s1, int s2) {
		
		System.out.println(s1*s2);
		
	}
	
	public void  mul (int  s3, int s4) {
		
		System.out.println(s3*s4);
		
	}
	

	public static void main(String[] args) {
		
		Calculator overriding = new Calculator();
		overriding.add(10, 20);
		System.out.println(overriding.add(10, 20, 30));
		overriding.sub(39.5467,20.1111);
		overriding.sub(20, 2);
		overriding.mul(20.10, 1);
		overriding.mul(90, 10);
	}

}
