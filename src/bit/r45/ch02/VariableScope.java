package bit.r45.ch02;

public class VariableScope {
	
	//멤버 필드
	char ch='a';
	int v4 = 0;
	
	//멤버 메소드
	public static void main(String[] args) {
		char a = 'a';		//문자형
		char b = 'b';
		char c = 'c';
		int ab=2147483647;
		
		String  str = "감사합니다.";
		System.out.println(str);
//		run();
//		myPrint();
		gravageValue();
		printstr();
		
	}
	
	static void printstr()
	{
		
	}
	
	static void gravageValue()
	{
		byte var1 = 125;
		int var2 = 125;
		
		for(int i =0;i<5;i++)
		{
			var1++;
			var2++;
			System.out.println("var1 : "+var1+"\t"+"var2 : "+var2);
		}
	}
	
	void run()
	{
//		System.out.println(a);
//		System.out.println(str);
		System.out.println(ch);
		
		int v1 = 15;
		int v2=0;
		if(v1>10)
		{
			v2 = v1-10;
		}
		int v3 = v1 + v2 + 5;
		v4 = v3+10;
		
	}
	
	void myPrint()
	{
		System.out.println(v4);
	}
	

}
