package jp.co.aforce.practice;

public class PracticeTest2 {
	
	public static void main(String[]args) {
		
		//問１
		double TAX = 0.1;
		System.out.println("消費税率:" + TAX);
	
		//問２
		int x = 480;
		double price =x * TAX;
		System.out.println("税込み価格:" + (x + price) + "円");
		
		//問３
		String name = "駒崎瑠菜";
		System.out.println(name);
		
		//問４
		String priceShop = "この商品の値段は";
		String priceName = "円です";
		System.out.println(priceShop + price + priceName);
		
		
		
	}

}
