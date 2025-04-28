package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;


public class PracticeTest3 {
	
	public static void main(String[]args) {
		
		//問１
		String [] stationery = { "シャープペンシル","ボールペン","リングノート","クリップ","消しゴム" };
		
		//問２
		System.out.println(stationery[1]);
		
		//問３
		ArrayList<String> employee = new ArrayList<>();
		employee.add("山田太郎");
		employee.add("鈴木花子");
		employee.add("佐藤次郎");
		employee.add("山田太郎");
		employee.add("高橋三郎");
		
		//問５
		System.out.println(employee.get(2));
		
		//問６
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);
		
		ArrayList<Integer> newList = new ArrayList<>();
		newList.addAll(list1);
		newList.addAll(list2);
		
		Collections.sort(newList);
		 for (Integer number : newList) {
	            System.out.println(number);
		 }
		 
		 //問７
		 
		 

}
	
}
