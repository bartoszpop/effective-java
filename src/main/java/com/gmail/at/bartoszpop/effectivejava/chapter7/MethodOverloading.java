package com.gmail.at.bartoszpop.effectivejava.chapter7;

import java.io.Serializable;

public class MethodOverloading {

	private static class A {
	}

	private static class B extends A {
	}

	public static void main(String[] args) {
		A aa = new A();
		methodWithRelatedTypes(aa); // A
		A ab = new B();
		methodWithRelatedTypes(ab); // A
		B bb = new B();
		methodWithRelatedTypes(bb); // B

		String[] array = new String[3];
		// methodWithUnrelatedTypes(array); //compile error
		methodWithUnrelatedTypes((Serializable) array); // Serializable
		methodWithUnrelatedTypes((Cloneable) array); // Cloneable
		methodWithRelatedTypes(array); // Serializable
		methodWithRelatedTypes((Object) array); // Object
	}

	private static void methodWithRelatedTypes(A a) {
		System.out.println("A");
	}

	private static void methodWithRelatedTypes(B b) {
		System.out.println("B");
	}

	private static void methodWithUnrelatedTypes(Serializable s) {
		System.out.println("methodWithUnrelatedTypes-Serializable");
	}

	private static void methodWithUnrelatedTypes(Cloneable c) {
		System.out.println("methodWithUnrelatedTypes-Cloneable");
	}

	private static void methodWithRelatedTypes(Object o) {
		System.out.println("methodWithRelatedTypes-Object");
	}

	private static void methodWithRelatedTypes(Serializable s) {
		System.out.println("methodWithRelatedTypes-Serializable");
	}
}