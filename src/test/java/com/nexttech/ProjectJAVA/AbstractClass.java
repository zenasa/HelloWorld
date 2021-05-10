package com.nexttech.ProjectJAVA;

abstract class AbstractClass {
	public static void meth() {
		String name = "a";
		System.out.println(name);
	}
	public void method1() {
	}
	
	public abstract void method2 () ;
	
	public abstract void method2 (int a, int b);
	public abstract void method3 ();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    meth();
	
	}

}
