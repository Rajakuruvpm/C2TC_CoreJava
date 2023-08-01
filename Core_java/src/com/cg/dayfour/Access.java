package com.cg.dayfour;

class Access {
	private void display() {
		System.out.println("private");
	}
	protected void d() {
		System.out.println("protected");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Access a=new Access();
		a.display();
		a.d();

	}

}
