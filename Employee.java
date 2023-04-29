package com.gl.prework;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello!");
		System.out.println();
		
		for(int i=0;i<4;i++) {
			System.out.println("Loop is running!");
		}
		System.out.println("Loop ended!");
		System.out.println();
		
		Scanner scan1 = new Scanner(System.in);
		String ans="yes";
		int num1;
		int sqr;
		while(ans.equals("yes")) {
			
			System.out.println("Enter a number: ");
			num1 = scan1.nextInt();
			
			if (num1>=100) {
				System.out.println("Sorry! Number is too big!");
				continue;
			}
			
			sqr= num1*num1;
			System.out.println("Square of number "+num1+"is "+sqr);
			System.out.println("Do you wish to continuw? Yes/No");
			ans=scan1.next();
		}
		System.out.println("You are out of loop");
		
		System.out.println("------");
		
		int rows=4;
		int num=1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
		System.out.println();
		}
	}

}
