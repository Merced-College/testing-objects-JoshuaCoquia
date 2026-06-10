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
		this.overallGradePercentage = 0d;
		this.assignmentCount = 0;

		// Use setters to sanitize parameter inputs
		setOverallGradePercentage(overallGradePercentage);
		setAssignmentCount(assignmentCount);
	}

	// Getters for Course fields

	public String getName() {
		return this.name;
	}

	public double getOverallGradePercentage() {
		return this.overallGradePercentage;
	}

	public int getAssignmentCount() {
		return this.assignmentCount;
	}

	// Setters for Course fields
	// I'm returning `this` after each setter to enable method chaining.

	public Course setName(String name) {
		this.name = name;
		return this;
	}

	public Course setOverallGradePercentage(double overallGradePercentage) {
		// Assuming that students cannot get above 100% and below 0%
		if (overallGradePercentage > 100d) {
			overallGradePercentage = 100d;
		} else if (overallGradePercentage < 0d) {
			overallGradePercentage = 0d;
		}
		this.overallGradePercentage = overallGradePercentage;
		return this;
	}

	public Course setAssignmentCount(int assignmentCount) {
		// Students cannot have a negative number of assignments, so whenever passed 0
		// for `assignmentCount`, actually set assignmentCount to 0.
		if (assignmentCount >= 0) {
			this.assignmentCount = assignmentCount;
		} else {
			this.assignmentCount = 0;
		}
		return this;
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
