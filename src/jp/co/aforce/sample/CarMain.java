package jp.co.aforce.sample;

public class CarMain {
	public  static void main(String[]args) {
		CarClass c1 = new CarClass();
		System.out.println("car1:メーカー " + c1.maker + ",色" + c1.color);
		
		CarClass c2 = new CarClass("トヨタ","赤");
	}

}
