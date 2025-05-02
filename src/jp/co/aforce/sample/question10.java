package jp.co.aforce.sample;

import java.util.HashSet;
import java.util.Set;

public class question10 {
	public static void main(String[] args) {
		//1
	        Set<String> taskId = new HashSet<>();

	        String[] data = {"TASK001", "TASK002", "TASK003", "TASK001", "TASK004", "TASK002"};

	        for (String task : data) {
	            taskId.add(task); 
	        }

	        System.out.println("処理済みのタスクID一覧:");
	        for (String id : taskId) {
	            System.out.println("- " + id);
	            }
			 }
		
		}

