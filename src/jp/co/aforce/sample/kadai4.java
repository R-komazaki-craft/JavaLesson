
//第７章
//問1
package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class kadai4 {

	public static void main(String[] args) {

		//問1	
		/*int i = 1;
		while (i <= 10) {
			System.out.println(+ i);
			i++;
		
		}*/

		//問2

		/*int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			sum = sum + i;
			i++;
		
		}
		System.out.println(sum);*/

		
		//問3	★
		/*Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int input = 1;
		System.out.println("整数を入力してください。:");
		
		while (	input != 0) {
			input = Integer.parseInt (scanner.nextLine());
			sum += input;
			
			
		}
		System.out.println("合計は" + sum + "です。");
		scanner.close();*/

		//do-while文
		//問1		
		/*int i  = 1;
		do {
			System.out.println(+ i);
			i++;
		} while (i <= 10);*/

		
		//問2
		
		/*int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 100);
		
		System.out.println("合計は" +sum);*/
		
		
		//問3
		/*Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int input = 1;
		System.out.println("整数を入力してください。:");
		
		do {
			input = Integer.parseInt (scanner.nextLine());
			sum += input;
			
		}while(input != 0);
		
		System.out.println("合計は" + sum + "です。");
		scanner.close();*/
		
		//for文
		//問1
		/*for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}*/
		
		//問2
		/*int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("合計は" +sum);*/
		
		//問3
		int n1 = 0, n2 = 1,n3;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i = 2; i< 10; i++ ) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
		//拡張for文
		//問1
		int [] x = {1,2,3,4,5};
		for(int element: x) {
			System.out.println(element);
		}
		
		//問2
		List<String> animal = new ArrayList<>();
		animal.add("usagi");
		animal.add("kame");
		animal.add("kotori");
		animal.add("sakana");
		
		for(String allAnimal:animal) {
			System.out.println(allAnimal);
		}
		//問3
		int [] y = {1,2,3,4,5};
		
		int sum = 0;
		for(int total:y) {
			sum += total;
		}
			System.out.println(sum);
			
		//break
		//問1
		for(int data = 1; data <= 10; data++ ) {
			if(data == 5) {
				break;
			}
			System.out.println(data);
		}
			
		//問2
		int[]seatch = {1,2,3,4,5,6,7,8,9,10};
			for(int seatchs:seatch) {
				if(seatchs == 7) {
					System.out.println("見つけました" + seatchs);
					break;
				}
			}
			
		//問3
		int[][]special = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		boolean found = false;
		
		for (int a = 0; a< special.length; a++) {
			for(int j = 0; j< special[a].length;j++) {
				if(          break;	
			}
		}
		if(found) {
			break;
		}
		
	if(found) {
		System.out.println("値5を見つけました。");
	}else {
		System.out.println("値5は見つかりませんでした。");
		
	}
  }

}


