package week3.day1;

public class Students {
	
	public void getStudentInfo(int StudentID) {
		
		System.out.println(StudentID);
		
	}
	
public void getStudentInfo(int StudentID, String StudentName) {
		
		System.out.println("Student Id is " + StudentID +" and Student Name is " + StudentName);
		
	}

public void getStudentInfo(String email, long phoneNumber) {
	
	System.out.println("Student email is " + email +" and Student number  is " + phoneNumber);
	
}

/*
In this class, method names are same but the arg types are different. 
In that case, we can have multiple methods having the same name.
This is called Method Overloading
*/

public static void main(String[] args) {
	
	Students Overload = new Students();
	Overload.getStudentInfo(95);
	Overload.getStudentInfo(95, "Vignesh");
	Overload.getStudentInfo("abc@gmail.com", 9123876543L);
	
}

}
