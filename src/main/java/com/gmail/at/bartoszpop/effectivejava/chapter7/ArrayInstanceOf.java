package com.gmail.at.bartoszpop.effectivejava.chapter7;

public class ArrayInstanceOf {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] intPrimitives = new int[0];
		System.out.println(intPrimitives instanceof Object); // true
		//System.out.println(intPrimitives instanceof Object[]); // compilation error "incompatible conditional operand types"

		String[] strings = new String[0];
		System.out.println(strings instanceof Object); // true
		System.out.println(strings instanceof Object[]); // true

		Object[] objects = new Object[0];
		System.out.println(objects instanceof Object[]); // true
		System.out.println(objects instanceof Object); // true
	}
}