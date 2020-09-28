package bit.r45.members;

//클래스
public class Student 
{
	//맴버들 : 필드(속성), 메서드(함수)
	
	/* 필드 */
	int age;
	int color;
	
	/* 메서드 */
	public void run(int x, int y)
	{
//		int x=1;
//		int y=2;
		
		int result = x+y;
		
		System.out.println(x + "+" + y + "=" + result);
		System.out.println(this.age);
	}
	
	//this
	public void setAge(int age) {
		this.age=age;
	}
	

	
	 
}
