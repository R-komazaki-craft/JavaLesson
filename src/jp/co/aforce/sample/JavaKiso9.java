package jp.co.aforce.sample;

public class JavaKiso9 {
	public static void main(String[]args) {
		//問1
		System.out.println("Hello,World!");
		
		//問2
		int a = 30;
		int b = 70;
		int sum = a + b;
		System.out.println(sum);
		
		//問4
		<メインクラス>
		public class Main{
			public static void main(String[]args) {
				Book book1 = new Book("ミッケ！",500);
				book1.showInfo();//忘れないように
			}
		}
		<Bookクラス>
		public class Book{
			String name;
			int price;
			
			public Book(String name , int price) {
				this.name = name;
				this.price = price;
			}
			void showInfo() {
				System.out.println("タイトル:" + name + "値段:" + price +"円");
			}
		}
		
		//問5
		

	}

}
