package bit.r45.ch02;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("층의 개수 : ");
		int num=sc.nextInt();
		int i,j,k;
		
		for(i =0;i<num;i++)
		{
			for(j=1;j<num-i;j++)
			{
				System.out.print(" ");
			}
			
			for(k=0;k<i*2+1;k++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
