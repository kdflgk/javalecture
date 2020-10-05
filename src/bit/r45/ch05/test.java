package bit.r45.ch05;

public class test {

	public static void main(String[] args) {
//		exam1();
		exam2();
//		exam3();
		
	}
	
	public static void exam1()
	{
		int[] intArray=null;
		intArray[0] = 10;
		System.out.println(intArray);
	}
	
	public static void exam2()
	{
		int[] scores = {100,99,80,90,50};
		int sum=0;
		int i;		
		float aver;
		
//		for(i=0;i<5;i++)
//		{
//			sum+=scores[i];
//		}		
//		aver = sum/i;
//		
//		System.out.println("평균 : " + aver);
		
		for(i=0;i<scores.length;i++)
		{
			sum+=scores[i];
		}		
		aver = sum/i;
		System.out.println("평균 : " + aver);
		
		//배열초기 : new
		int[] adder = new int[5];
		
		for(int j=0;j<scores.length;j++)
		{
			adder[j]=scores[j]+2;
		}
		System.out.println(scores);
		System.out.println(adder);
		
	}

	public static void exam3()
	{
		//문자열배열
		String[] messages = {"안녕하세요", "감사해요", "잘있어요", "다시만나요","힘들었던하루","매일같은사람들과","또다시새로운","하루일을","시작해"};		

		for(int i=0;i<messages.length;i++)
		{
			System.out.println(messages[i]);			
		}		
		
	}

	public static void exam4()
	{
		
		
		
	}


}
