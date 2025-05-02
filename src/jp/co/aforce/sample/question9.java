package jp.co.aforce.sample;

import java.util.Scanner;

public class question9 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("商品の単価を入力してください: ");
		int price = scanner.nextInt();

		System.out.println("購入個数を入力してください: ");
		int count = scanner.nextInt();

		int sum = price * count;
		
		scanner.close();

		// 購入金額割引
		double priceDiscount = 0.0;

		if (sum >= 10000) {
			priceDiscount = 0.10;
		} else if (sum >= 5000) {
			priceDiscount = 0.05;
		}
		double totalPriceDiscount = sum * priceDiscount;

		// 個数割引
		int countDiscount = 0;
		if (count >= 5) {
			countDiscount = 100 * count;

		} else if (count >= 3) {
			countDiscount = 50 * count;
		}

		// 合計割引額 
		double totalDiscount = totalPriceDiscount + countDiscount;

		// 割引後の金額
		double discountedTotal = sum - totalDiscount;

		// 消費税
		double tax = discountedTotal * 0.10;
		double taxInTotal = discountedTotal + tax;

		System.out.println("商品の単価:" + price + "円");
		System.out.println("購入個数:" + count + "個");
		System.out.println("割引前の合計金額:" + sum + "円");
		System.out.println("割引額:" + (int)totalDiscount + "円");
		System.out.println("割引後の価格:" + (int)discountedTotal + "円");
		System.out.println("消費税額:" + (int)tax+ "円");
		System.out.println("税込価格:" + (int)taxInTotal + "円");
	}
}
