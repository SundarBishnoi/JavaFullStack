class Person {
	// Instance variable(Data or "State")
	String name;
	int age;
	// classes can contain
	// 1.Data
	// 2.Subroutines
}

public class Application {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Sundar";
		System.out.println(person1.name);
		Person person2 = new Person();
		person2.age = 20;
		System.out.println(person2.age);
	}
}
