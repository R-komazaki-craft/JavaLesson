package jp.co.aforce.sample;

//9章 クラスの基礎
//クラス
//問1
public class Person {
	String name;
	int age;

	//コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Person p = new Person("太郎", 25);
		System.out.println("名前;" + p.name + "年齢:" + p.age);
	}
}

//問2
public class Book {
	String title;
	String author;
	int price;

	//コンストラクタ
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void showInfo() {
		System.out.println("タイトル:" + title + ",著者:" + author + "価格:" + price + "円");
	}

	public static void main(String[] args) {
		Book book = new Book("Java入門", "山田太郎", 1500);
		book.showInfo();
	}
}

//問3
public class Student {
	String name;
	int[] grade;

	public Student(String name, int[] grade) {
		this.name = name;
		this.grade = grade;
	}

	//平均の計算
	double getAverage() {
		int sum = 0;
		for (int grades : grade) {
			sum += grades;
		}
		return (double) sum / grade.length;
	}

	//mainのメソッド
	public static void main(String[] args) {
		int[] grade = { 80, 95, 70 };
		Student student = new Student("谷加奈子", grade);
		System.out.println("成績の平均:" + student.getAverage());
	}
}

//問4

public class Employee{
	String id ;
	String name;
	double salary;
	
	public Employee(String id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//昇給の計算メソッド
	void raiseSlary(double percent) {
		salary += salary * percent / 100;
	}
	//メインメソッド
	public static void main(String[]args) {
		Employee emp = new Employee("ABC8","佐藤正樹",300000);
		emp.raiseSlary(10);
		System.out.println("昇給後の給与:" + emp.salary + "円");
	}
}

//問5
public class BankAccount{
	String bankNumber;
	Stirng bankName;
	double price;
	
	public BankAccount(String bankNumber,String bankName,double price) {
		this.bankNumber = bankNumber;
		this.bankName = bankName;
		this.price = price;	
	}
	
	//入金メソッド
	void deposit(double amount) {
		price += amount;
		System.out.println(amount + "円を入金しました。");
	}
	
	//引き出しメソッド
	void withdraw(double amount) {
		if(price >= amount) {
			price -= amount;
			System.out.println(amount + "円を引き出しました。");
			}else {
		}System.out.println("残高不足です。");
	}
}
//インスタンス
//問1
public class Dog {
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public static void main(String[]args) {
		Dog dog = new Dog("ポチ");
		System.out.println("犬の名前:" + dog.name);//.name忘れがちのなので忘れないように！
	}
}

//問2★
//Catのインスタンス生成
    Cat cat = new Cat();
    cat.name = "ミケ";
    cat.meow();
    
 //別のインスタンス生成
    Cat cat2 new Cat();
    cat2.name = "タマ";
    cat2.meow();
    }
  }
  
//問3
  
  public class Car{
	  String model;
	  double speed;
	  
  public Car(String model,double speed) {
	  this.model = model;
	  this.speed = speed;
  }
  
  //インスタンス１
  public static void main(String[]args) {
	  Car car1 = new Car("プリウス",100);
	  Car car2 = new Car("アルファード",130);
	  
	  System.out.println("車種:" + car1.model + "速度:" + car1.speed + "km/h");
	  System.out.println("車種:" + car2.model + "速度:" + car2.speed + "km/h");
  	}
  }
//問4
  public class Rectangle {
	  int weight;
	  int height;
	  
	  public Rectangle(int weight,int hight) {
		  this.weight = weight;
		  this.height = height;
	  }
	  
	  //面積の計算
	  int total() {
		  return weight * height;
	  }
	  
	  public static void main(String[] args) {
		  Rectangle rec = new Rectangle(5,10);	
		  System.out.println("面積:" + rec.total());
	  }
  }
//問5★
  public class Robot {
	  String name;
	  
	  public Robot(String move) {
		  this.name = name;
	  }
	  void move() {
		  System.out,println(name + "が動きました");
	  }
	  
	  public static void main (String[] args) {
		  Robot r1 =  new Robot("A1");
		  Robot r2=  new Robot("B1");
		  
		  r1.move();
		  r2.move();
	  }
			  
  }
//問6
  public class Student{
	  String name;
	  int[] score;
	  
	  public Student(String name,int[] score) {
		  this.name = name;
		  this score = score;  
	  }
	  
	  //合計
	  int getTotalScore() {
	  int sum = 0;
	  for (int scores : score) {
		  sum += scores;
	  }
	  //平均
	  double getAverageScore() {
		  return(double)getTotalscore()/score.length;
	  }
	  
	  //メイン
	  
	  public static void main(String[]args) {
		  int[]score1 = {80,70,80};
		  Student student1 = new Student("Bob",score1);
		  
		  int[]score2 = {60,70,50};
		  Student student2 = new Student("Mika",score2);
		  
		  int[]score3 = {80,80,100};
		  Student student3 = new Student("Abi",score3);
		  
		  
		  System.out.println(student1.name + "合計点:" + student1.getTotalScore());
		  System.out.println(student1.name + "平均点:" + student1.getAverageScore());
		  
		  
		  System.out.println(student2.name + "合計点:" + student2.getTotalScore());
		  System.out.println(student2.name + "平均点:" + student2.getAverageScore());
		  System.out.println(student3.name + "合計点:" + student3.getTotalScore());
		  System.out.println(student3.name + "平均点:" + student3.getAverageScore());
	  }
	  
  }





















