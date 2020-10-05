package bit.r45.ch04;

import java.io.IOException;
import java.util.Scanner;

public class Whiletest {

	public static void main(String[] args) throws Exception {
//		exam1();
//		exam2();
//		exam3();
		exam4();
	}

	public static void exam1()
	{
		int num =0;
		int i=1;
		while(i<100)
		{
			num = num+i;
			i++;
		}
		System.out.println("1에서 " + (i-1) +"까지의 합 : "+num);
	}
	
	public static void exam2() throws Exception
	{
		boolean run = true;
		int speed=0;
		int keycode=0;
		
		while(run)
		{
			if(keycode!=13 && keycode!=10)
			{
				System.out.println("====================");
				System.out.println("[1]가속 [2]감속 [3]중지");
//				System.out.println("[→]가속 [←]감속 [↑]중지");
				System.out.println("====================");
				System.out.print("선택 : ");
			}
			
			keycode = System.in.read();
			
			if(keycode==9)
			{
				speed++;
				System.out.println("현재속도 : "+ speed);
			}
			else if(keycode==50)
			{
				speed--;
				System.out.println("현재속도 : "+ speed);
			}
			else if(keycode==51)
			{
				run =false;
			}			
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	public static void exam3()
	{
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scn = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scn.nextLine();
			System.out.println(inputString);
		}
		while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}
	
	public static void exam4()
	{
		Scanner scn = new Scanner(System.in);
		int rannum = (int)(Math.random()*100+1);
		int number=0;

		do {
			if(number==0)
				System.out.print("숫자를 입력해 주세요 : ");
			else if(rannum>number)
				System.out.print("더 큰 숫자를 입력해 주세요 : ");
			else if(rannum<number)
				System.out.print("더 작은 숫자를 입력해 주세요 : ");
			number = scn.nextInt();
		}
		while(rannum!=number);		

		System.out.println("'"+rannum+"'" + " 정답!!!");
		
	}
	
	
}
