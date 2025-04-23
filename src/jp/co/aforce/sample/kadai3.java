package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class kadai3 {
	public static void main(String[]args) {
		
		Map<Integer,String> dayWeek = new HashMap<>();
		dayWeek.put(1,"月曜日");
		dayWeek.put(2,"火曜日");
		dayWeek.put(3,"水曜日");
		dayWeek.put(4,"木曜日");
		dayWeek.put(5,"金曜日");
		dayWeek.put(6,"土曜日");
		dayWeek.put(7,"日曜日");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("曜日の番号(1～7)を入力してください。");
		Integer youbi = scanner.nextLine();
		scanner.close();
		
		System.out.println(dayWeek.get(youbi) +"です。");
	}

}
