public class Course {
	// This class represents a university course from the perspective of a student.
	private String name;
	private double overallGradePercentage;
	private int assignmentCount; // Assignments could be its own object if I wanted to...
	// I decided not to implement a separate Assignments object for simplicity.

	public Course() { // no-arg constructor
		this.name = "Course";
		this.overallGradePercentage = 0; // Assuming that a student starts with a grade of 0.
		this.assignmentCount = 0;
	}

	public Course(String name, double overallGradePercentage, int assignmentCount) { // parameterized constructor
		this.name = name;
		this.overallGradePercentage = overallGradePercentage;
		this.assignmentCount = assignmentCount;
	}

	@Override
	public String toString() { // Override `toString`
		// Matching the format shown in the Dog object's `toString` method.
		return "Course{name=\"" + this.name + "\", overallGradePercentage=" + this.overallGradePercentage
				+ ", assignmentCount=" + this.assignmentCount + "}";
		// NOTE: My IDE automatically wraps lines at a certain number of characters,
		// though I don't exactly remember how many.
	}
	// TODO: Implement encapsulation and explain validation rule
	// TODO: Write tests
}
