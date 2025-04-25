package jp.co.aforce.sample;

public class Taiyaki {

	String filling;

	//中身のセット
	public void setFilling(String nakami) {
		filling = nakami;
	}

	//中身の表示
	public void showFilling() {
		System.out.println("このたい焼きの中身は:" + filling + "です。");
	}
}
