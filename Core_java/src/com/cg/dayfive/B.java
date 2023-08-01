package com.cg.dayfive;

import com.cg.dayfour.Child;

public class B extends A {

	public void display() {
		System.out.println("This is multiple inheritance");
	}

	public static void main(String[] args) {
		B b=new B();
		b.display();
		b.print();
	}

}