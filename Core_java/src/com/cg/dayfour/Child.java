package com.cg.dayfour;

public class Child extends Singleinheritance {
	public void display() {
		System.out.println("This is multiple inheritance");
	}

	public static void main(String[] args) {
		Child ch=new Child();
		ch.display();
		ch.print();
	}

}
