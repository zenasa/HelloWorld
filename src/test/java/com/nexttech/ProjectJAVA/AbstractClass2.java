package com.nexttech.ProjectJAVA;

public class AbstractClass2 extends AbstractClass {

	public static void main(String[] args) {
		AbstractClass2 obj = new AbstractClass2() ;
        meth();
        obj.method2(5,4);
        
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2(int a, int b) {
	int sum = a+b;
	System.out.println("The sum is "+sum);
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}
