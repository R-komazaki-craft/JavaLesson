package jp.co.aforce.sample;

public class ex {
	public static void main(String[] args) {
		Taiyaki t1 =new Taiyaki();
		Taiyaki t2 = new Taiyaki();
		
		t1.setFilling("クリーム");
		t2.setFilling("あんこ");
		
		t1.showFilling();
		t2.showFilling();
		
		}	
	}
	