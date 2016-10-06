import java.util.Arrays;

public class Course {
	
	String name;
	int credits;
	int seatsRemaining;
	int seatsTotal;
	Student[] roster;
	/**
	 * @param name
	 * @param credits
	 * @param seatsRemaining
	 * @param roster
	 */
	public Course(String name, int credits, int seatsRemaining) {
		super();
		this.name = name;
		this.credits = credits;
		this.seatsRemaining = seatsRemaining;
		this.seatsTotal = seatsRemaining;
		this.roster = new Student[seatsRemaining];
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * @return the seatsRemaining
	 */
	public int getRemainingSeats() {
		return seatsRemaining;
	}
	/**
	 * @return the roster
	 */
	public Student[] getRoster() {
		return roster;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * @param seatsRemaining the seatsRemaining to set
	 */
	public void setSeatsRemaining(int seatsRemaining) {
		this.seatsRemaining = seatsRemaining;
	}
	/**
	 * @param roster the roster to set
	 */
	public void setRoster(Student[] roster) {
		this.roster = roster;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + ", seatsRemaining=" + seatsRemaining + ", roster="
				+ Arrays.toString(roster) + "]";
	}
	
	public boolean addStudent(Student neo) {
		Student neoUnplugged = neo;
		
		boolean success;
		success = false;
		
		//check to see if student is enrolled using name
		Student roster[] = this.getRoster();
		int seats = roster.length;
		//System.out.println("Seats are: " + seats);
		//for loop checks seats
		
		for(int i = 0; i < seats; i++) {
			//System.out.println("roster is " + this.roster[i]);
			if(this.roster[i] != null) {
				String guysName = this.roster[i].getName();
				String neosName = neoUnplugged.getName();
				if(guysName == neosName) {
					return false;
				}
			}
		}
		//check number of seats remaining 
		//TODO
		int remaining = this.getRemainingSeats();
		if(remaining > 0) {
			roster[this.seatsTotal-remaining] = neoUnplugged;
			this.seatsRemaining--;
			success = true;
		}
		return success;
	}
	
	//generateRoster prints a String of all students.  
	public String generateRoster() {
		String amazing = "";
		
		for(int i = 0; i < this.roster.length; i++) {
			if(this.roster[i] != null){
				amazing += this.roster[i].getName();
				amazing += "\n";
			}
		}
		return amazing;
	}
	
	//averageGPA returns an average of all students enrolled in the course
	public double averageGPA() {
		double totalGPA = 0.00;
		int counts = 0;
		for(int i = 0; i < this.roster.length; i++) {
			if(this.roster[i] != null){
				totalGPA += this.roster[i].getGPA();
				counts++;
			}
		}
		double average = totalGPA / counts;
		return average;
		
	}
	
	
	
	
}
