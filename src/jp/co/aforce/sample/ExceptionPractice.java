package jp.co.aforce.sample;

public class ExceptionPractice {

	public static void main(String[] args) {
		//String str = null;
		

		try {
			//int[]nums = {1,2,3};
			//System.out.println(str.length());
			//System.out.println(nums[5]);
			
            int age = 15;
            if (age < 18) {
                throw new IllegalArgumentException("18歳未満は登録できません。");

            }
            System.out.println("登録が完了しました。");
		} catch (IllegalArgumentException e) {
		
		//(NullPointerException e) {
			//System.out.println("ヌルポが発生しました:" + e.getMessage());
			System.out.println("例外が発生しました:"+ e.getMessage());
			
		} 
			//System.out.println("プログラムは継続します");
		}
	}
