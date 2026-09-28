package com.OOpsPolymorphisms;

public class TesteDemo1 {

	void main(String[] args) {
		addition();
		addition(100);

	}

	void addition() {
		System.out.println("No arg addition method called ");
	}

	void addition(int i) {
		System.out.println("one arg addition method called ");
	}

	void addtion(float i) {
		System.out.println("Two arg addtion method called " + i);
	}

}
