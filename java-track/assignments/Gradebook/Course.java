package Gradebook;

public class Course {

	private String name;
	private int credits;
	private int remainingSeats;
	private Student[] roster;
	
	public Course(String name, int credits, int remainingSeats) {
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
		this.roster = new Student[remainingSeats]; 
	}

	public Student[] getRoster() {
		return this.roster;
	}

	public void setRoster(Student[] roster) {
		this.roster = roster;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return this.credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getRemainingSeats() {
		return this.remainingSeats;
	}

	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}

	public boolean addStudent(Student a) {
		if (this.remainingSeats == 0) {
			return false;
		}
		for (int i = 0; i < roster.length; i++) {
			if (roster[i] == a) {
				return false;
			}
			else {
				roster[i] = a;
			}	
		}
		this.remainingSeats -= 1;
		return true;
	}
	
	public double averageGPA() {
		double gpaSum = 0.0;
		for (int j = 0; j < roster.length; j++) {
			gpaSum += roster[j].getGPA();
		}
		int classSize = this.roster.length + 1;
		double classAvg = gpaSum /(double)classSize;
		return Math.round(classAvg * 1000.0) / 1000.0;
	}
	
	public String toString() {
		return "Course Name: " + this.name + "Course Credits: " + this.credits;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
