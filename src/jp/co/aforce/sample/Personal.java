package jp.co.aforce.sample;

public class Personal {
	String name;
	int age;
	
	public Personal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Name:" + name + ",Age:" + age);
	}
	
	
}

