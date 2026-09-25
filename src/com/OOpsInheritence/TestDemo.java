package com.OOpsInheritence;

public class TestDemo {
	protected void finalize() throws Throwable{
		System.out.println("finalize method called");
	}
	TestDemo(){
		super();
		System.out.println("No-arg constructor called ! ");
	}

	void welcome(){
		System.out.println("Welcome to OOps !!");
		System.out.println(this.getClass());
		
	}
	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo t1 = new TestDemo();
		System.out.println(t1);
		
		TestDemo t2 = new TestDemo();
		System.out.println(t2);
		
		int t1h=0x27716f4;//hexa decimal value
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t1h);
		
		TestDemo t3 = new TestDemo();
		t3=t2;
		t3.welcome();
		System.gc();
		System.out.println(t1.equals(t2));//false
		System.out.println(t2.equals(t3));//True

		
	}

}
