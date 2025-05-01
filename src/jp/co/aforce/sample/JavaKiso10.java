package jp.co.aforce.sample;

public class JavaKiso10 {

}
//問1
public class Person {
	String name;
	int age;
	
	//コンストラクター
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//メイン
	public static void main(String[]args) {	
		Person person = new Person("Runa",24);
		System.out.println("名前:" + person.name + "年齢:" + person.age);
	}
}

//問2
public class Car{
	String name;
	int year;
	
	//デフォルト コンストラクター
	public Car() {
		this.name = "Unknown";
		this.year = 0;
	}
	
	//引数付きコンストラクター
	public Car(String name,int year) {
		this.name = name;
		this.year = year;
	}
	
	
	//Main
	public static void main(String[]args) {
		Car defaultCar = new Car();
		Car specialCar = new Car("Matsuda",2001);
		
		System.out.println("デフォルトカー" + defaultCar.name + "," + defaultCar.year);
		System.out.println("特定カー" + specialCar.name + "," + specialCar.year);
	}
	
}
//問3
public class Book{
	String title;
	String author;
	int price;
	
	
	//コンストラクター
	public Book (String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//タイトルと著者のみを引数に取るコンストラクター
	public Book (String title,String author) {
		this(title,author,0);
	}
	//Main
	public static void main(String[]args) {
		Book book1 = new Book("優しいJava","滝口健太郎",1500);
		Book book2 = new Book("Java中級","滝口健太郎");
		
		System.out.println("タイトル:" + book1.title +"著者名:" + book1.author +"価格:" + "円");
		System.out.println("タイトル:" + book2.title +"著者名:" + book2.author +"価格:" + "円");
	}
	
	//オーバーロード
	//問1
	int a = 10;
	int b = 20;
	int sum = a + b;
	
	int c= 10;
	int d = 20;
	int e = 30;
	int total = c + d + e;
	
	System.out.println("";)
	
	//問2
	//問3
	//
	
	
}











