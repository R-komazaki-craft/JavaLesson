package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class kadai2 {
	
	public static void main(String[]args){

		
//問１
		List<String> countList = new ArrayList<String>();
		
		countList.add("0");
		countList.add("1");
		countList.add("2");
		countList.add("3");
		countList.add("4");
	
		countList.add(0,"4");
		
		System.out.println(countList);
		
	}
}

//問２

//問３

		List<String> fruitsList = new ArrayList<String>();
		
		fruitsList.add("リンゴ");
		fruitsList.add("バナナ");
		fruitsList.add("さくらんぼ");
		
		fruitsList.remove("バナナ");
		
		fruitsList.add("オレンジ");
		
		System.out.println(fruitsList);
		
//問１		
		Linked<String> list = new LikedList<String>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		String element0 = list.get(0);
		String element1 = list.get(1);
		
		System.out.println("最初の要素:" +element0 + "最後の要素:" +element1);
		
		
		
		
		
		
		
		
		
		
		
