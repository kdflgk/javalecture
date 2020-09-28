package bit.r45.ch02;

public class TypeCasting {
	public static void main(String[] args) {
		//암묵적 타입 변환
		byte b1=10;
		int val =b1;
		System.out.println(val);
		
		char ch ='가';
		val =ch;
		System.out.println("'가'의 유니코드 : " +val);
		
		val =500;
		long lv = val;
		System.out.println(lv);
		
		val =200;
		double db = val;
		System.out.println(db);
		
		//명시적 타입 변환
		val =(int)b1;
		
		checkvaluefefore();
		frominttodouble();
		
	}
	
	public static void checkvaluefefore()
	{
		int i =128;
		if((i>Byte.MAX_VALUE) || (i<Byte.MIN_VALUE))
		{
			System.out.println("Can't cast to byte");
		}
		else
		{
			byte b = (byte)i;
			System.out.println(b);
		}
	}
	
	public static void frominttodouble()
	{
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int)num3;
		
		int result = num1-num2;
		System.out.println(result);
		
		int intval=10;
		double dbval=5.5;
		
		double result2=intval+dbval;
		System.out.println(result2);
	}
	

}
