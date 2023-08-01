package com.cg.daytwo;
import java.util.Scanner;
public class contstm {

	public static void main(String[] args) {
	System.out.println("enter a number:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=0;i<=a;i++) {
		if(i==4) {
			continue;
		}
		System.out.println(i);
	}

	}

}
