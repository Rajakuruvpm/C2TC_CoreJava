package com.cg.daytwo;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter first no:");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter second no:");
		int b=sc.nextInt();
		
		System.out.println("addition:"+(a+b));
		System.out.println("subtraction:"+(a-b));
		System.out.println("multiplication:"+(a*b));
		System.out.println("division:"+(a/b));


	}

}
