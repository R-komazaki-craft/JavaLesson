package jp.co.aforce.sample;

import java.util.Scanner;

public class JavaKiso4 {
	
	public static void main(String[]args) {
		
		//第7章:制御構文
		
		//問1
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください。:");
		int newNumber = scanner.nextInt();
		
		if(newNumber % 2 == 0) {
			System.out.println(newNumber + "は偶数です。");
		}else {
			System.out.println(newNumber + "は奇数です。");
		}
		
		//問2
		//2回目はいらない。Scanner scanner2 = new Scanner(System.in);
		System.out.println("整数を入力してください。:");
		int newNumber2 = scanner.nextInt();
		if(newNumber2 > 0) {
			  System.out.println(newNumber2 + "は正の数です。");
		}else if(newNumber2 < 0){
		    System.out.println(newNumber2 + "は負の数です。");
		}else {
			  System.out.println(newNumber2 + "は0です。");
		}
		//問3
		System.out.println("辺の長さを3つ入力して下さい。:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a + b > c && a + c > b && b + c > a) {
			System.out.println("有効な三角形です。");
		}else {
			System.out.println("無効な三角形です。");
		}
		//問4
		System.out.println("年齢を入力してください。:");
		int newNumber3 = scanner.nextInt();
		if(newNumber3 <= 12) {
			System.out.println("無料です。");
		}else if(newNumber3 >= 13 && newNumber3 <= 59 ) {
			System.out.println("1000円です。");
		}else if(newNumber3 >= 60){
			System.out.println("500円です。");
		}
		
		
		//(switch文)
		//問3
		System.out.println("曜日の番号(1～7)を入力してください。:");
		int day = scanner.nextInt();
		switch (day) {
			case 1:
				  System.out.println("月曜日");
			break;
			
			case 2:
				  System.out.println("火曜日");
			break;
			
			case 3:
				  System.out.println("水曜日");
			break;
			
			case 4:
				  System.out.println("木曜日");
			break;
			
			case 5:
				  System.out.println("金曜日");
			break;
			
			case 6:
				  System.out.println("土曜日");
			break;
			
			case 7:
				  System.out.println("日曜日");
			break;
			default:
				  System.out.println("無効な番号です。");
			break;
		}
		
		
		//問4
		System.out.println("月の番号(1～12)を入力してください。:");
		int month = scanner.nextInt();
		switch (month) {
			case 1:
				  System.out.println("1月");
			break;
			
			case 2:
				  System.out.println("2月");
			break;
			
			case 3:
				  System.out.println("3月");
			break;
			
			case 4:
				  System.out.println("4月");
			break;
			
			case 5:
				  System.out.println("5月");
			break;
			
			case 6:
				  System.out.println("6月");
			break;
			
			case 7:
				  System.out.println("7月");
			break;
			
			case 8:
				  System.out.println("8月");
			break;
			
			case 9:
				  System.out.println("9月");
			break;
			
			case 10:
				  System.out.println("10月");
			break;
			
			case 11:
				  System.out.println("11月");
			break;
			
			case 12:
				  System.out.println("12月");
			break;
			default:
				  System.out.println("無効な番号です。");
			break;
		}
		//問5
		System.out.println("成績を入力してください。(A～F):");
		char grade = scanner.next().charAt(0);
		switch(grade) {
			case'A':
				 System.out.println("大変よく出来ました！");
			break;
			case'B':
				 System.out.println("よく出来ました");
			break;
			case'C':
				 System.out.println("頑張りました");
			break;
			case'D':
				 System.out.println("頑張りましょう");
			break;
			case'E':
				 System.out.println("もっと頑張りましょう");
			break;
			case'F':
				 System.out.println("残念です");
			break;
			default:
				  System.out.println("無効な番号です。");
			break;
		}
		
		scanner.close();
		
		
	}
	
	

}
