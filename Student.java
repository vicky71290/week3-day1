package week3.day1;

public class Student extends Department{
	
	public void studentName() {
		
		System.out.println("Student 1");
		
	}

	public String studentDept(String StudentDept) {
		
		return StudentDept;
		
	}
	
	public int studentId(int studentId) {
		
		return studentId;
		
	}
	
	public static void main(String[] args) {
		
		Student multiInheritance = new Student();
		
		multiInheritance.collegeName();
		multiInheritance.collegeCode();
		System.out.println(multiInheritance.collegeRank(5));
		System.out.println(multiInheritance.deptName("Mech"));
		multiInheritance.studentName();
		System.out.println(multiInheritance.studentDept("ECE"));
		System.out.println(multiInheritance.studentId(95));
		
	}
	
}
