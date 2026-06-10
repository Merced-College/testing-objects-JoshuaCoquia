public class Dog {
	public String name;
	public int age;
	public String breed;

	public Dog() { // default constructor
		name = "Unknown";
		age = 0;
		breed = "Mixed";
	}

	public Dog(String name, int age, String breed) { // parameterized constructor
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
	}
}
