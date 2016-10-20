
public class controller {

	public static void main(String[] args) {
		//used to run Gradebook seperate from the Tests
		Student bill = new Student("Bill", "Jones", 12345);
		System.out.println(bill);
		Course math = new Course("Math 101", 3, 30);
		Course english = new Course("english", 3, 25);
		System.out.println("All courses: " + Course.getAllCourses());

	}

}
