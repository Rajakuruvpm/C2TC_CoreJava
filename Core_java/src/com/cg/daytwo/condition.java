package com.cg.daytwo;
import java.util.Scanner;
public class condition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sub1:");
		int m1=sc.nextInt();
		System.out.println("enter sub2:");
		int m2=sc.nextInt();
		System.out.println("enter sub3:");
		int m3=sc.nextInt();
		System.out.println("enter sub4:");
		int m4=sc.nextInt();
		 int avg=(m1+m2+m3+m4)/4;
		if(avg>90) {
			System.out.println("O");
		}
		else if(avg>80 && avg<90) {
			System.out.println("A+");
		}
		else if(avg>70 && avg<80) {
			System.out.println("A");
		}
		else if(avg>60 && avg<70) {
			System.out.println("B+");
		}
		else {
			System.out.println("B");
		}

	}

}
