package jp.co.aforce.sample;

public class Person {
	String name;
	int age;
	
	//コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[]args) {
		Person p = new Person("太郎",25);
		System.out.println("名前;" + p.name + "年齢:" + p.age);
	}
}
