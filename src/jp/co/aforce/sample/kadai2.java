package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class kadai2 {
	
	public static void main(String[]args){

//６章：コレクション		
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
ArrayList<String>deleteList = new ArrayList<>();

		deleteList.add("ぶどう");
		deleteList.add("キウイ");
		deleteList.add("メロン");
		deleteList.add("ぶどう");
		
		HashSet<String>newset = new HashSet<>(deletelist);
		
		System.out.println("重複を削除したセット:" + newset);
		
		}
	}}
		
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
		
//問２
		ArrayList<String>SpecialData = new ArrayList<>();
		SpecialData.add("15");
		SpecialData.add("8");
		SpecialData.add("97");
		SpecialData.add("51");
		
		int seartch = 15 ;
		boolean contains = list.contains(seartch);
		System.out.println("リストに" + seartch +"が含まれているか:" + contains);
		
//問３
		ArrayList<String>SpellList = new ArrayList<>();
		SpellList.add("Egg");
		SpellList.add("Apple");
		SpellList.add("Zoff");
		SpellList.add("Boss");
		
		Collection.sort(SpellList);
		System.out.println("ソートしたリスト" + list);

		//ハッシュとは
//問１
//問２		
//問３
//問１
		
//問２
				
//問３
