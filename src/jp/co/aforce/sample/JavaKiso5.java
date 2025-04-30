package jp.co.aforce.sample;

public class JavaKiso5 {
	
	//オブジェクト指向
	//問2
	
	class Person{
		private String name;
		private int age;
		
		//コンストラクタ
		public Person (String name,int age) {
			this.name = name;
			this.age = age;
		}
		//nameのgetter.setter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		//ageのgetter.setter
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			if(age >= 0) {
				this.age = age;
			}
		}
	}
	
	//問2
	//親クラス
	class Person{
		protected String name;
		protected int age;
		
		//コンストラクタ
		public Person (String name,int age) {
			this.name = name;
			this.age = age;
		}
		//name
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
			if(age >= 0) {
				this.age = age;
			}
		}
	}
	//子クラスの継承
	class Student extends Person{
		private String studentId() {
			
		//コンストラクタ
		public Student(String name , int age,String studentId) {
			super(name,age);
			this.studentId = studentId;
		}
		public String getStudentId() {	
		    return studentId;
		}
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
	}

}
	//問2
	
	//親クラス(animal)
	class Animal{
		void makeSound() {
			System.out.println("Some sound... ");
		}
	}
	
	//子クラス(dog)
	class Dog extends Animal{
		@Override
		void makeSound() {
			System.out.println("Woof! Woof!");
		}
	}
	
	//子クラスcat
	class Cat extends Animal{
		@override
		void makeSound() {
			System.out.println("Meow! Meow!");
		}
	}
	
	//メインクラス
	public class Main{
		public static void main(String()args) {
			Animal myDog = new Dog();
			Animal myDog = new Cat();
			
			myDog.makeSound();
			myCat.makeSound();
		}
	}
