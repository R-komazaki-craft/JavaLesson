package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {

		List<String> fruitsList = new ArrayList<String>();

		fruitsList.add("apple");
		fruitsList.add("peach");
		fruitsList.add("grape");
		fruitsList.add("potato");
		
		
		String element3 = fruitsList.remove(3);
		fruitsList.remove("peach");

		System.out.println(fruitsList);
	}
}



