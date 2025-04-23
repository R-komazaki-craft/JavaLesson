package jp.co.aforce.sample;

public class ifpractice {

	public static void main(String[] args) {

		//boolean型は変数名だけでも判定ができる

		boolean isRainy = true;
		if (isRainy) {
			System.out.println("傘を持っていきましょう");
		}

		boolean isSunny = true;
		if (isSunny) {
			System.out.println("傘はいりません");
		}
		//else文
		int temperature = 25;
		if (temperature >= 30) {
			System.out.println("真夏日です。");
		} else {
			System.out.println("真夏日ではありません。");
		}

		//if else文
		int score = 75;
		if (score >= 80) {
			System.out.println("優");
		} else if (score >= 70) {
			System.out.println("良");
		} else if (score >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		//if 論理演算子

		int time = 14;
		boolean isHoliday = false;

		if (time <= 9 && time >= 18  || isHoliday) {
			System.out.println("勤務時間外です。");
		} else {
			System.out.println("勤務時間内です。");
		}
		//入れ子
		boolean hasLicense = true;
		boolean hasCar = false;
		
		if(hasLicense) {
			System.out.println("運転免許を持っています。");
			if(hasCar) {
				System.out.println("車も持っています。");
			}else {
				System.out.println("しかし、車は持っていません。");
			}
		}else {
			System.out.println("運転免許を持っていません。");
		}
		//switch文
		String color = "yellow";
		String message;
		switch(color) {
		case"red":
			message = "停止してください。";
			break;
		case "yellow":
			message = "注意してください。";
			break;
		case "blue":
			message = "進んでください。";
			break;
		default:
			message = "不正な信号の色です。";
		}
		System.out.println("現在の信号の色:" + color + "-" + message);
		
		

	}
}
