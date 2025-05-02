package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class question8 {

	public static void main(String[] args) {
		List<String> fruitsList = new ArrayList<>();

		fruitsList.add("リンゴ");
		fruitsList.add("バナナ");
		fruitsList.add("さくらんぼ");
		fruitsList.remove("バナナ");
		fruitsList.add("オレンジ");
		System.out.println(fruitsList);

	}
}
