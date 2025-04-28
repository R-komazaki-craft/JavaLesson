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
	}
	
	

}
