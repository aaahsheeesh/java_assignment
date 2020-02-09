package com.lab10;

interface InstanceCreation {
	SampleClass display(String name, int age);
}

class SampleClass {

	String name;
	int age;

	public SampleClass() {
		super();
	}

	public SampleClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Name : " + name + "Age : " + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Exercise4 {

	public static void main(String[] args) {

		// Instance Creation using Method Reference
		InstanceCreation ic = SampleClass::new;
		ic.display("Gautam", 21);
		System.out.println("Created ");
	}
}
