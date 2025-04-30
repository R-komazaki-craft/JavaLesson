package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaKiso3 {

	public static void main(String[]args){

//６章：コレクション		
//問１
		List<String> countList = new ArrayList<String>();
		
		countList.add("0");
		countList.add("1");
		countList.add("2");
		countList.add("3");
		countList.add("4");
	
		Collections.reverse(countList);
		
		System.out.println(countList);
		


//問２
ArrayList<String>deleteList = new ArrayList<>();

		deleteList.add("ぶどう");
		deleteList.add("キウイ");
		deleteList.add("メロン");
		deleteList.add("ぶどう");
		
		HashSet<String>newset = new HashSet<>(deleteList);
		
		System.out.println("重複を削除したセット:" + newset);
		
		
//問３

		List<String> fruitsList = new ArrayList<String>();
		
		fruitsList.add("リンゴ");
		fruitsList.add("バナナ");
		fruitsList.add("さくらんぼ");
		fruitsList.remove("バナナ");
		fruitsList.add("オレンジ");
		
		System.out.println(fruitsList);
		
//問１		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("おはよう");
		list.add("こんにちは");
		list.add("こんばんは");
		
		String element0 = list.get(0);
		String element1 = list.get(1);
		
		System.out.println("最初の要素:" +element0 + "最後の要素:" +element1);
		
//問２
		ArrayList<Integer>SpecialData = new ArrayList<>();
		SpecialData.add(15);
		SpecialData.add(8);
		SpecialData.add(97);
		SpecialData.add(
				51);
		
		int searchValue = 15;
		boolean contains = SpecialData.contains(searchValue);
		System.out.println("リストに" + searchValue +"が含まれているか:" + contains);
		
//問３
		ArrayList<String>SpellList = new ArrayList<>();
		SpellList.add("Egg");
		SpellList.add("Apple");
		SpellList.add("Zoff");
		SpellList.add("Boss");
		
		Collections.sort(SpellList);
		System.out.println("ソートしたリスト" + SpellList);

		//ハッシュとは
//問１
		Map<String,Integer> fruitsMap = new HashMap<>();
		fruitsMap.put("ぶどう",200);
		fruitsMap.put("パイナップル",500);
		fruitsMap.put("柿",100);
		fruitsMap.put("りんご",150);
		
		int value = fruitsMap.get("ぶどう");
		
		System.out.println("ぶどうの値:" + value);
		
//問２	
		Set<String> dataList = new HashSet<>();
		dataList.add("kawa");
		dataList.add("yama");
		dataList.add("umi");
		
		System.out.println(dataList);
		
//問３★
		
		Map<String,Integer> classMap = new HashMap<>();
		classMap.put("田中太郎",1);
		classMap.put("佐藤由美子",2);
		classMap.put("金子弥生",3);
		classMap.put("栗原正",4);
		
		for(String key : classMap.keySet()) {
		    System.out.println("キー:" + key + ",値:" + fruitsMap.get(key));
		}
		
//問１
		int [] number = { 1,2,3,4,5 };
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		System.out.println(list2);
		
		
//問２
		ArrayList<String> string2 = new ArrayList<>();
		string2.add("傘");
		string2.add("太陽");
		string2.add("曇り");
		
		String[]array = new String[string2.size()];
		string2.toArray(array);
		
		System.out.println("配列の要素:");
		for(String element : array ) {
			System.out.println(element);
		}
				
//問３
		String[]names = {"鈴木","佐藤","田中"};
		int[] grades = {60,80,90};
		
		int total = 0;
		for(int grade :grades) {
			total += grade;
		}
		
		double average = (double) total / grades.length;
		System.out.println("成績の平均:" + average);
	}

   }

