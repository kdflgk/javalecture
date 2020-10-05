package bit.r45.ch04;

import java.util.Scanner;

public class Fortest {

	public static void main(String[] args) {
//		exam1();
//		exam2();
//		exam3();
		exam4();
		
	}
	
	public static void exam1()
	{
		//1~6까지합
		int sum=0;		
		for(int i =1;i<=6;i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		
		//1~6까지합
		sum=0;		
		for(int i =1;i<7;i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);

		//1~100까지합
		sum=0;		
		for(int i =1;i<=100;i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		
		//1~20까지 2씩 더하기
		sum=0;		
		for(int i =1;i*2<=20;i++)
		{
			sum = sum + i*2;
		}
		System.out.println(sum);
		
		//1~100까지합 단,sum=85일경우 빠져나오기
		sum=0;		
		for(int i =1;i<=100;i++)
		{
			sum = sum + i;
			if(sum==85)
				break;
		}
		System.out.println(sum);
	}
	
	public static void exam2()
	{
		int num=0;
		//구구단
		for(int i =1;i<=9;i++)
		{
			System.out.println("*** " + i + "단 ***");
			
			for(int j =1;j<=9;j++)
			{
				num = i*j;
				System.out.println(i + " * " + j + " = " + num);	
			}
		}
	}
	
	public static void exam3()
	{
		int sum=0;
		int k =0;
		for(k=1;k<=100;k++)
		{
			sum=k+sum;
		}
		
		System.out.println("횟수 : " +k+"번 만에 sum = "+sum);
		
	}
	
	public static void exam4()
	{	
		//구구단			
		Scanner scn = new Scanner(System.in);
		int num=0;
		
		System.out.print("몇단?  ");
		int i = scn.nextInt();
		
		for(int j=1;j<=9;j++)
		{
			num = i*j;
			System.out.println(i + " * " + j + " = " + num);	
		}
	}
	
	
	
	
}
