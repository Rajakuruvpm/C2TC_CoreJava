package com.cg.daytwo;
public class Nestedif {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a==10) {
			if(b==20) {
				System.out.println("this is nested if");
			}
		else {
			System.out.println("not a nested if");
		}
		}
	}

}
