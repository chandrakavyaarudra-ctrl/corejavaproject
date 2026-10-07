package com.OOpsAbstraction;

interface In1 {
	void method1();

	void method2();

	default void method4() {
		System.out.println("Method4 called fron In1");
	}

}

interface In2 {
	void method2();

	void method3();

	default void method4() {
		System.out.println("Method4 called fron In1");
	}

}

interface In3 extends In1, In2 {

	public default void method4() {
		In1.super.method4();
	}

}

// How java is supporting multiple inheritance, because in interfaces we have only decelerations
//but from implemented class here it is unique implementation, 
//so there is no ambiguity from the functionalities.
// so that is the reason java supports multiple inheritance for interfaces.
class Test1 implements In3 {

	@Override
	public void method1() {

		System.out.println("method1 called ");
	}

	@Override
	public void method2() {
		System.out.println("method2 called ");

	}

	@Override
	public void method3() {

		System.out.println("method3 called ");

	}

}

public class TestDemo1 {

	public static void main(String[] args) {

		In3 i = new Test1();
		i.method1();
		i.method2();
		i.method3();
		i.method4();

	}

}
