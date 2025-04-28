package jp.co.aforce.practice;

import java.util.Calendar;

public class kaitou5 {
	
	public static void main (String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH)+ 1;
		System.out.println(month + "月");
		
		String message;
		
		switch(month){
			case 1:message = "冬物セール";
				   break;
			
			case 2:
			case 3:
			case 4:message ="春物を売る";
				   break;
			case 5:message = "春物セール";
			       break;
			case 6:
			case 7:message ="夏物を売る";
				   break;
			case 8:message = "夏物セール";
				   break;
			case 9:message ="秋物を売る";
			 	   break;
			case 10:
			case 11:
			case 12:message ="冬物を売る";
				   break;
				   
			default:message = "不正な月です";
			
		}
		System.out.println(message);
			
			
				
		}
		
	}

