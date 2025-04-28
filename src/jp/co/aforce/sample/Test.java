package jp.co.aforce.sample;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//	第2章値と演算
//問１
public class DoubleInteger{
	public static void main(String[]args) {
		int num = 5;
		int int2x = num * 2;
		System.out.println("5 × 2 =" + int2x);
	}
}

//2
public class GreaterThanTen{
	public static void main(String[]args) {
		int num =12;
		boolean isGreaterThanTen = num > 10;
		System.out.println(num + "は10より大きいですか?:" + isGreaterThanTen);
	}
}

//3
public class EvenOrOdd{
	public static void main(String[]args) {
		int num = 7;
		if(num % 2 == 0) {
			System.out.println(num + "は偶数です。" );
		}else{
			System.out.println(num + "は奇数です。" );
		}
	}
}

//4
public class HalfUnit{
	public static void main(String[]args) {
		double num = 4.5;
		double half = num / 2;
		System.out.println("半分の値:" + half);
	}
}

//5
public class SpilitUnit{
	public static void main(String[]args) {
		double num = 7.8;
		int integerPart = (int)num;
		double decimalPart = num - integerPart;
		System.out.println("整数部分:" +integerPart );
		System.out.println("少数部分:" + decimalPart);
	}
}








//3章 変数 4章5章
//問1
public class DataUnit{
	public static void main(String[]args) {
		int num = 10;
		System.out.println("値は" + num "です。");
	}
}

//2
public class DataUnit2{
	public static void main(String[]args) {
		int a = 8;
		int b = 5;
		int sum = a + b;
		System.out.println(a + "+" + b + "=" + sum);
	}
}

//3
public class DataArea{
	public static void main(String[]args) {
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println("長方形の面積は" + area + "です。");
	}
}

//4
public class DataProgram{
	public static void main(String[]args) {
		String name = "Java";
		double version = 17.0;
		boolean isFun = true;
		System.out.println("名前:" + name);
		System.out.println("バージョン:" + version);
		System.out.println("楽しいですか?:" + isFun);
	}
}

//5
import java.util.Scanner;

public class UserName {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("こんにちは、" + name +"さん！");
		
		scanner.close();
	}
}	

//6
public class UserInfo{
	public static void main (String []args) {
		String name = "駒崎瑠菜";
		int age = 24;
		BirthDay = LocalDate.of(2001, 4, 23);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		String formattInfo = String.format("名前":%s,%d歳,誕生日:%s,name,age,birthDate.format(formatter));
		
		System.out.println(formatInfo);
	}
}
		

//7
public class ShopCount{
	public static void main (String[] args) {
		String name = Laptop;
		int count = 1200;
		int sum = count *3
		
		System.out.println(name + "は、価格:" + count + "円なので,3個買うと" + sum + "です。")
	}
}

//8
		a.-45
//9
		
//10
		
//20 
        a.A





























