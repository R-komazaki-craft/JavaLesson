package jp.co.aforce.sample;

import java.util.ArrayList;

public class forMatome {

	public static void main (String[] args) {
		
		ArrayList<Integer> testResult = new ArrayList<>();
		testResult.add(85);
		testResult.add(92);
		testResult.add(78);
		testResult.add(65);
		testResult.add(98);
		testResult.add(70);
		
		int count = 0;
		
		for(int result : testResult) {
			if(result >= 70){
				count++;
			}
		}
		
		System.out.println("70点以上の得点の個数は" + count +"個です。");
		
	}
}
