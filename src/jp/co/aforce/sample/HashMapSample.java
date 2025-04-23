package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
	
	public static void main(String[] args) {
		
		Map<String,Integer> nameMap = new HashMap<>();
		nameMap.put("Bob",1);
		nameMap.put("Alice",2);
		nameMap.put("John",2);
		nameMap.put("Tom",1);
		
		nameMap.remove("Alice");
		
		System.out.println(nameMap);
	}

}
