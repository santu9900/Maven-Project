package javaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		//String s="AUTOMATION";
		StringBuilder sb= new StringBuilder();
		sb.append(s);
		
		System.out.println("the reversed string is= "+sb.reverse());
		// TODO Auto-generated method stub

	}

}
