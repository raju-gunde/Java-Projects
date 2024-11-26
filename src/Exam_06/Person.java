package Exam_06;

import java.io.Serializable;

public class Person implements Serializable
{
	String name;
	int age;
	String Email;
	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		Email = email;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", Email=" + Email + "]";
	}
	
	
	

}
