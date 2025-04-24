package jp.co.aforce.sample;

import java.util.ArrayList;

public class forSample {
	
	public static void main (String[] args) {
		
		/*for( int i = 1; i <= 10; i++) {
			System.out.println(i);
		}*/
		
		ArrayList<String> employees = new ArrayList<>();
		employees.add("田中太郎");
		employees.add("山田花子");
		employees.add("佐藤次郎");
		
		for(String employee:employees) {
			
			System.out.println(employee);
		}
	}

}
