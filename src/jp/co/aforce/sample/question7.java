package jp.co.aforce.sample;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("年齢を入力して下さい:");
		int age = scanner.nextInt();

		if (age < 0 || age > 120) {
			System.out.println(age + "は不正な年齢です。");
		} else if (age <= 3) {
			System.out.println(age + "歳は無料です。");
		} else if (age >= 4 && age <= 12) {
			System.out.println(age + "歳は500円です。");
		} else if (age >= 13 && age <= 17) {
			System.out.println(age + "歳は800円です。");
		} else if (age >= 18 && age <= 59) {
			System.out.println(age + "歳は1200円です。");
		} else if (age >= 60) {
			System.out.println(age + "歳は700円です。");

		}
	}
}
