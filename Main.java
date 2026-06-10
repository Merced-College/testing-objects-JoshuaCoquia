public class Main {
	public static void main(String[] args) {
		// A1: Create a Dog with no constructors defined.
		Dog dog1 = new Dog();

		// A2: Print the object directly.
		System.out.println("Printing dog1 directly:");
		Dog d1 = new Dog();
		System.out.println("\nDefaults for d1 fields (before any assignment):");
		System.out.println("name = " + d1.name); // expected: null
		System.out.println("age = " + d1.age); // expected: 0
		System.out.println("breed = " + d1.breed); // expected: null System.out.println(dog1);
	}
}
