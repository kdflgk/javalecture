package bit.r45.ch02;

public class HelloLiteral {

	public static void main(String[] args) {
		char a = 'a';		//문자형
		char b = 'b';
		char c = 'c';
		
		int n = 10;			//정수형
		int n1 = 1000;
		int z = -1000;
		
		int hex = 0xAF01;	//16진수
		int oct = 0137;		//8진수
		
		float r1 = 0.25f, r2=-3.14f;	//실수형
		
		boolean istrue = true, iszero = false;	//불리언형
		
		//==============================================================
		
		String  str = "감사합니다.";
		System.out.println(str);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(n);
		System.out.println(n1);
		System.out.println(z);
		System.out.println(hex);
		System.out.println(oct);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(istrue);
		System.out.println(iszero);
		
	}

}
