package bit.r45.ch06;

public class test {

	public static void main(String[] args) {
//		exam1();
//		exam2();
//		exam3();
//		exam4();
//		exam5();
//		exam6();
		exam7();
		
	}
	
	public static void exam1() {
		//Car
		Car car = new Car();
		
		String str = car.info();
		System.out.println(str);

		str = car.info("달려!!");		
		System.out.println(str);
		
		Car car2 = new Car("못달려!! ");
		
		System.out.println(car);
		System.out.println(car2);
	}
	
	public static void exam2() {
		//Member객체생성
		Member mem1 = new Member("1234","홍길동",2000);
		Member mem2 = new Member("5678","동성일",450);
		Member mem3 = new Member("9123","일동길",1680);
		
		//info()함수이용해 객체출력
		System.out.println("아이디\t이름\t포인트");
		mem1.info();
		mem2.info();
		mem3.info();
		
		//배열초기화
		Member[] members=new Member[5];
		for(int i =0;i<5;i++) {
			members[i]=new Member(""+i,"이름",1000+(10*i));
		}
		for(Member mem : members) {
			mem.info();
		}

	}
	
	public static void exam3() {
		Computer mycom = new Computer();
		
		int[] values1= {1,2,3};
		int result1 = mycom.sum1(values1);
		System.out.println("result1 : "+result1);
		
		int result2 = mycom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : "+result2);
		
		int result3 = mycom.sum2(1,2,3);
		System.out.println("result3 : "+result3);
		
		int result4 = mycom.sum2(1,2,3,4,5);
		System.out.println("result4 : "+result4);
		
	}

	public static void exam4() {
		Printer printer = new Printer();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}
	
	public static void exam5() {
		//생성자
		Calculator cal = new Calculator();
		System.out.println(cal.pi);
		
		//스태틱
		System.out.println(Calculator.pi);
		System.out.println(Calculator.plus(5,4));
	}
	
	public static void exam6() {
//		Singleton obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}
	
	public static void exam7() {
		
	}
	
	public static void exam8() {
		
	}
	
	
}
