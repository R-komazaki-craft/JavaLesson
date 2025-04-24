package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class ouyouMondai {
	public static void main (String[] args) {
		
		Map<String,String> CountryCapital = new HashMap<>();
		
		CountryCapital.put("日本","東京");
		CountryCapital.put("アメリカ合衆国","ワシントンD.C.");
		CountryCapital.put("フランス","パリ" );
		CountryCapital.put("中国","北京");
		
		System.out.println("すべての国と首都は" + CountryCapital);

		/*String = country;
		String = capital;*/
		
		for(String country:CountryCapital.keySet()) {
			if(country.contains("日")) {
				String capital = CountryCapital.get(country);
				System.out.println("「日」を含む国とその首都は" + country + "で、首都は" + capital + "です。");
				
			}
	 	 }
	}
}
