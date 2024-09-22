package javaPrograms;

import java.util.Scanner;

public class SwappingNumberUsing3rdVariable {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X");
		int X = sc.nextInt();
		System.out.println("Enter the value of Y");
		int Y = sc.nextInt();
		
		int temp=X;
		 X=Y;
		Y=temp;
		System.out.println("After swapping the value of X is "+X);
		System.out.println("After swapping the value of Y is "+Y);
		
		
		
		// TODO Auto-generated method stub

	}

}
