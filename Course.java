public class Course {
	// This class represents a university course from the perspective of a student.
	private String name;
	private double overallGradePercentage;
	private int assignmentCount; // Assignments could be its own object if I wanted to...
	// I decided not to implement a separate Assignments object for simplicity.

	public Course() {
		this.name = "Course";
		this.overallGradePercentage = 0; // Assuming that a student starts with a grade of 0.
		this.assignmentCount = 0;
	}

	// TODO: Add a parameterized constructor
	// TODO: Print this object using `toString` before using @override
	// TODO: @override `toString()` and reprint the object
	// TODO: Implement encapsulation and explain validation rule
	// TODO: Write tests
}
