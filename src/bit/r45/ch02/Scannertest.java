package bit.r45.ch02;

import java.util.Scanner;

public class Scannertest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+num+"살");
	}

}
