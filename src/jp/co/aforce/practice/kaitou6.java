package jp.co.aforce.practice;

import java.util.Random;

public class kaitou6 {
	public static void main(String[]args) {
		
		Random random = new Random();
		int fortune = random.nextInt(4);
		String result = "";
		
		switch (fortune) {
		case 1:result = "吉です";
				break;
				
		case 2:result = "中吉です";
				break;
				
		case 3:result = "大吉です";
		
		default:result = "凶です";
				break;
		}
		System.out.println(result);
		
	//問題２
		for(int i = 1; i <= 100; i++) {
			if(i % 7  == 0) {
				System.out.println(i + ",");
			}
		}
		
	//問題３
		for(int y = 1; y <= 9; y++) {
			for(int x = 1; x <= 9; x++) {
				System.out.printf("%2d" ,y * x);
			}
			System.out.println();
		}
		
	}
	
	

}
