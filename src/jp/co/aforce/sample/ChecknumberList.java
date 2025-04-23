package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ChecknumberList {
	
	public static void main(String[] args) {
		
		List<String> checkNumber = new ArrayList<String>();
		
		
	
		int newNumber = 12;
		String large ="大きい";
		
		if (newNumber > 10) {
			checkNumber.add(large);
		}else {
			checkNumber.add("small");
		}
		System.out.println(checkNumber);
	}


}
