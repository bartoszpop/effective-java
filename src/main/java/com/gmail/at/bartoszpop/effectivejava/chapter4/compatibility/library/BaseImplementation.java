package com.gmail.at.bartoszpop.effectivejava.chapter4.compatibility.library;

//comment doesn't break binary compatibility of IndirectImplementation.java
public class BaseImplementation /*implements ConstantInterface */{
	public void test() {
		//System.out.println(CONSTANT_INT);
	}
}