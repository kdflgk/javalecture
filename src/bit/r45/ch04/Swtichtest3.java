package bit.r45.ch04; 

import java.util.Scanner;

public class Swtichtest3 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("입력 : ");
		int year = scr.nextInt();		
		boolean leaf = leafyear(year);
		
		if(leaf)
			System.out.println(year + "년은 윤년입니다.");
		else
			System.out.println(year + "년은 평년입니다.");
		
	}
	
	public static boolean leafyear(int year)
	{
		if((year%4==0 && year%100!=0)||year%400==0)
			return true;
		else
			return false;
	}

}
