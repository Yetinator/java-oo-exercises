import java.text.DecimalFormat; 

public class Student {
	
	private String firstName, lastName;
	private int studentId;
	private int credits;
	private double gpa;
	private String classStanding;
	private double qualityScoreTotal; //Grades multiplied by credits total
	DecimalFormat df = new DecimalFormat("#.000");
	

	
	public Student(String firstName, String lastName, int studentId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.gpa = 0.0;
		this.credits = 0;
		this.classStanding = "Freshman";
		this.qualityScoreTotal = 0.0;
		
	}
	//overloaded version for createLegacy function
	public Student(String firstName, String lastName, int studentId, double gpa, int credits, double qualityScoreTotal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.gpa = gpa;
		this.credits = credits;
		this.classStanding = "Freshman";
		this.qualityScoreTotal = qualityScoreTotal;
		
	}
	


	/**
	 * @param classStanding the classStanding to set
	 */
	public void setClassStanding(String classStanding) {
		this.classStanding = classStanding;
	}


	/**
	 * @return the whole Name
	 */
	public String getName() {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentID() {
		//TODO studentID or this.studentId?  
		return (int) studentId;
	}
	/**
	 * @return the credits
	 */
	public int getCredits() {
		//TODO credits or this.credits?  
		return this.credits;
	}
	/**
	 * @return the gpa
	 */
	public double getGPA() {
		//TODO gpa or this.gpa?
		return gpa;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = HelpMe.digits(gpa);
	}
	
	public void setQualityScoreTotal(double newtotal) {
		this.qualityScoreTotal = HelpMe.digits(newtotal);
	}
	
	public String toString() {
		
		return this.getName() + ", " + this.getStudentID();
	}
	
	public double getQualityScoreTotal() {
		return this.qualityScoreTotal;
	}
	
	// getClassStanding returns student's year ranking based on the number of credits
	public String getClassStanding() {
		if (this.credits < 30) {
			this.classStanding = "Freshman";
		}
		if(this.credits >= 30 && this.credits < 60){
			this.classStanding = "Sophomore";
		}
		if(this.credits >= 60 && this.credits < 90){
			this.classStanding = "Junior";
		}
		if(this.credits >= 90){
			this.classStanding = "Senior";
		}
		return this.classStanding;
	}
	
	// SubmitGrade() takes a course grade as a value between 1 and 4 and the number of credits for the course and updates the student's gpa accordingly
	public void submitGrade(double grade, int credits) {
		setQualityScoreTotal(this.qualityScoreTotal + (grade * credits));
		this.credits += credits;
		this.gpa = HelpMe.digits(this.qualityScoreTotal / this.credits); 
		//System.out.println("Quality Score: " + this.qualityScoreTotal);
		//System.out.println("credits: " + this.credits);
		//System.out.println(this.getName());
		//System.out.println("gpa: " + this.gpa);
		//System.out.println("gpa strait: " + gpa);
		//TODO 3 decimals not taking on quality Score or GPA
	}
	
	//computeTuition() returns the tuition paid
	public double computeTuition() {
		double whole = this.getCredits() / 15; 
		double remainder = this.getCredits() % 15;
		double rate = 1333.33;
		double tuition = remainder * rate + whole * 20000;
		//System.out.println("Tuition is: " + tuition);
		return tuition;
		
		
		/*
		double whole = Math.floor(this.getCredits() / 15); 
		double remainder = this.getCredits() % 15;
		double rate = 1333.33;
		double tuition = remainder * rate + whole * 20000.0;
		tuition = Math.round(tuition * 100.0);
		tuition = tuition/100.0;
		//System.out.println("Tuition is: " + tuition);
		return tuition;
		*/
		
		/*
		double rate = 20000.0 / 15;
		double tuition = rate * getCredits();
		tuition = Math.round(tuition * 100);
		tuition = tuition/100;
		System.out.println("tuition is:  " + tuition);;
		return tuition;
		*/
	}
	//String firstName, String lastName, int studentId, double gpa, int credits, double qualityScoreTotal
	public static Student createLegacy(Student mom, Student dad) {
		String firstName = mom.getName();
		String lastName = dad.getName();
		int studentId = mom.getStudentID() + dad.getStudentID();
		double gpa = (mom.getGPA() + dad.getGPA() ) / 2;
		int credits = 0;
		if(mom.getCredits() > dad.getCredits()) {
			credits = mom.getCredits();
		} else {
			credits = dad.getCredits();
		}
		double qualityScoreTotal = gpa * credits;
		
		
		
		Student toby = new Student(firstName, lastName, studentId, gpa, credits, qualityScoreTotal);
		return toby;
	}
	

}
