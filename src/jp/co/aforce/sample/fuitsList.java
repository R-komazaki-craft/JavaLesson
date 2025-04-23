package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fuitsList {

	public static void main(String[] args) {

		Map<String, Integer> fruitsShop = new HashMap<>();
		fruitsShop.put("りんご", 100);
		fruitsShop.put("みかん", 80);
		fruitsShop.put("バナナ", 120);
		fruitsShop.put("いちご", 300);

		Scanner scanner = new Scanner(System.in);//スキャン
		System.out.println("購入したい果物を教えてください。:");
		String newFruits = scanner.nextLine();
		//System.out.println(newFruits);
		scanner.close();

		if (fruitsShop.containsKey(newFruits)) {
			System.out.println(newFruits + "は" + fruitsShop.get(newFruits) + "円です。");
		} else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}

	}
}
