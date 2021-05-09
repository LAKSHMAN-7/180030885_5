package com.myfirstpack;
import java.util.Scanner;
public class PosorNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number:");
		num=scn.nextInt();
		scn.close();
		
		if(num > 0)
			System.out.printf("%d is Positive Number", num);
		else if(num < 0)
			System.out.printf("%d is Negative Number", num);
		else
			System.out.printf("%d is Zero",num);
		
		

	}

}
