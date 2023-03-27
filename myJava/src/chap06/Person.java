package chap06;

public class Person {
	int age;
	char gender;
	String name;
	
	public Person(int age, char gender, String name) {
		this.age = age;
		this.gender = gender;
		this.name = name;		
	}
	
	public String toString() {
		return this.age + ":" + this.gender + ":" + this.name;
	}

}
