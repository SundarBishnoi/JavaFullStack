class Person{
	int age;
	String name;
	int calculateYearsToRetirement() {
		int yearsLeft;
		yearsLeft=65-age;
		return yearsLeft;
	}
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
	int[] getValues() {
		int[] a= {15,20};
		return a;
	}
}
public class Application {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name="Sundar";
		person1.age=20;
		int years= person1.calculateYearsToRetirement();
		System.out.println(years);
		int age = person1.getAge();
		System.out.println(age);
		String name = person1.getName();
		System.out.println(name);
		int[] b =  person1.getValues();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
