package javaPrograms;

import java.util.Scanner;

public class SwappingNumbersWithout3rdVariable {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X");
		int X = sc.nextInt();
		System.out.println("Enter the value of Y");
		int Y = sc.nextInt();
		X=X+Y;
		Y=X-Y;
		X=X-Y;
		System.out.println("After swapping the value of X is "+X);
		System.out.println("After swapping the value of Y is "+Y);
		
		// TODO Auto-generated method stub

	}

}
