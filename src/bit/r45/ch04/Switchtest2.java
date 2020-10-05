package bit.r45.ch04;

import java.util.Scanner;

public class Switchtest2 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.print("월을 입력하세요 : ");
		int month = scr.nextInt();
		
		switch(month) {
			case 1:
			case 3:
			case 5:			
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31일");
				break;
			case 2:
				System.out.println("28일");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일");
				break;
		}
		
		System.out.println();
	}

}
