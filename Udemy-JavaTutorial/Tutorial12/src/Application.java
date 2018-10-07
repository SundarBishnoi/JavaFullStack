class Person {
	// Instance variable(Data or "State")
	String name;
	int age;
	// classes can contain
	// 1.Data
	// 2.Subroutines
	void speak() {
		for(int i=0;i<2;i++) {
			System.out.println("This is "+ name +" and " + age +" years old.");
		}
	}
	void sayHello() {
		System.out.println("Hello There!");
	}
}

public class Application {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Sundar";
		person1.age =21;
		System.out.println(person1.name);
		person1.speak();
		person1.sayHello();
		Person person2 = new Person();
		person2.name = "bishnoi";
		person2.age = 21;
		person2.speak();
		person2.sayHello();
		System.out.println(person2.age);
	}
}