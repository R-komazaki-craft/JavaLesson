package jp.co.aforce.sample;

public class StudentMain {
	public static void main(String[] args)
	{
		Student s1 = new Student();
		
		s1.name = "田中太郎";
        s1.seiseki = new double[] {70,50,90};
        
        s1.getAvg();
		
	}

}	
	class Student{
		String name;
	    int[] seiseki;
		
		public void getAvg() {
			double sum = 0;
			
			
		}
	}
