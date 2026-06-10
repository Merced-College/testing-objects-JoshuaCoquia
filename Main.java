public class Main {
	public static void main(String[] args) {
		// A1: Create a Dog with no constructors defined.
		Dog dog1 = new Dog();

		// A2: Print the object directly.
		System.out.println("Printing dog1 directly:");
		Dog d1 = new Dog();
		System.out.println("\nDefaults for d1 fields (before any assignment):");
		System.out.println("name = " + d1.getName()); // expected: null
		System.out.println("age = " + d1.getAge()); // expected: 0
		System.out.println("breed = " + d1.getBreed()); // expected: null
		System.out.println(dog1);

		Dog d2 = new Dog(); // uses default constructor values
		System.out.println("\nd2 after default constructor:");
		System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

		Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
		System.out.println("\nd3 after parameterized constructor:");
		System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

		System.out.println("\nPrinting objects after overriding toString():");
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);

		System.out.println("\nMutating via setters after making fields private:");
		d3.setAge(6);
		d3.setName("Maxwell");
		d3.setBreed("Border Collie");
		System.out.println("d3 age via getter = " + d3.getAge());
		System.out.println("d3 now = " + d3);

		// NOTE: Start student defined Course object related code below
		// As an aside, do we get to go over unit tests in this course?

		// Test instantiation of Course and printing of Course's `toString()` method
		Course genericCourse = new Course();
		System.out.println("\nPrinting Course object");
		System.out.println(genericCourse.toString());

		// Test instantiation of Course via parameterized constructor
		Course CPSC39 = new Course("CPSC-39", 100, 1);
		System.out.println("\nPrinting Course object instantiated through parameterized constructor");
		System.out.println(genericCourse.toString());

		// Test Getters/Setters

		// TODO: Write tests for Course object
	}
}
