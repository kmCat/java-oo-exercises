package Gradebook;

public class Student {

	private String name;
	private int studentID;
	private int credits;
	private double GPA;
	private String classStanding;
	
	public Student(String firstName, String lastName, int studentID) {
		this.name = firstName + " " + lastName;
		this.studentID = studentID;
		this.credits = 0;
		this.GPA = 0.0;
		this.classStanding ="Freshman";	
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String firstName, String lastName) {
		this.name = firstName + lastName;
	}

	public int getStudentID() {
		return this.studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public int getCredits() {
		return this.credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public double getGPA() {
		return this.GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public String getClassStanding() {
		if (credits < 30) {
			classStanding = "Freshman";
		}
		else if (credits < 60) {
			classStanding = "Sophomore";
		}
		else if (credits < 90) {
			classStanding = "Junior";
		}
		else {
			classStanding = "Senior";
		}
			this.classStanding = classStanding;
			return this.classStanding;
	}


	public void submitGrade(double courseGrade, int courseCredits) {
		double totalGPA = this.GPA * this.credits;
		this.credits += courseCredits;
		totalGPA = totalGPA + (courseGrade * courseCredits);
		this.GPA = Math.round((totalGPA / this.credits) * 1000.0) / 1000.0;
		
	}
	
	public double computeTuition() {
		
		int fullSemesters = this.credits / 15 * 20000;
		//double semestersPaid = fullSemesters * 20000.0;
		
		double leftOver = this.credits % 15 * 1333.33;
		//double perCredit = 1333.33;
		
		//double creditsPaid = perCredit * leftOver;
		return fullSemesters + leftOver;
		
		//double perCredit = Math.round((20000.0 / 15) * 100.0) / 100.0;
		//return this.credits * perCredit;
	}
	
	public Student createLegacy(Student other){
		int studentID = this.studentID + other.getStudentID();
		Student bb = new Student(this.name, other.name, studentID);
		bb.setGPA((this.GPA + other.GPA)/2.000);
		bb.setCredits(Math.max(this.credits, other.credits));
		return bb;
	}
	
	public String toString() {
		return "Name: " + this.name + "Student ID: " + this.studentID;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student a = new Student ("Test", "Tuition", 1);
		//a.setCredits(25);
		//System.out.println(a.computeTuition());
		//System.out.println((20000.00 * 1) + (1333.33 *10));
	}

}
