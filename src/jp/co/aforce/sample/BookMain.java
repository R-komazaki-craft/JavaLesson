package jp.co.aforce.sample;


public class BookMain {
	public static void main(String[] args) {
		Book t1 =new Book();
		
		t1.title = "名探偵コナン";
        t1.author ="青山剛掌";
        t1.price = 600;
        
        t1.showInfo();
	}
}	

	class Book{
		String title;
		String author;
		int price;
	
		public void showInfo() {
		System.out.println("タイトル:" + title  + "  著者:" + author + "  値段" + price + "円");
		}
	}

		
		
		