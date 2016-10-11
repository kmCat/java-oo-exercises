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
		for (int i = 0; i < this.roster.length; i++) {
			if (this.roster[i] == a) {
				return false;
			}	
		}
		this.roster[this.roster.length - this.remainingSeats] = a;
			
		this.remainingSeats -= 1;
		return true;
	}
	
	public double averageGPA() {
		double gpaSum = 0.0;
		for (int j = 0; j < this.roster.length - this.remainingSeats; j++) {
			gpaSum += this.roster[j].getGPA();			
		}
		double classAvg = gpaSum / (double)(this.roster.length - this.remainingSeats);
		return classAvg;
	}
	
	public String toString() {
		return "Course Name: " + this.name + "Course Credits: " + this.credits;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
