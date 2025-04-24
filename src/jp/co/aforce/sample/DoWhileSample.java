package jp.co.aforce.sample;

public class DoWhileSample {

	public static void main(String[] args) {
		//
		int i = 0;
		
		do {
			System.out.println("iの値:" + i);
			i++;
		} while (i < 5);

		
		while (i < 5) {

			System.out.println("iの値:" + i);
			i++;
		}
		
		//出力の違い
		
		do {
			System.out.println("iの値:" + i);
			i ++;
		}while ( i < 5 );
		
	
		while (i < 5) {
		    System.out.println("iの値: " + i);
		    i++;
		}

	}

}
