package com.gmail.at.bartoszpop.effectivejava.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class Varargs {
	public static void main(String[] args) {
		List<Integer> gatheredNumbers = gather(1, 2);
		
		int[] digitPrimitives = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 4 };
		List<int[]> gatheredDigitPrimitives = gather(digitPrimitives);
		
		Integer[] digitWrappers = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 4 };
		List<Integer> gatheredDigitWrappers = gather(digitWrappers);
		
		List<? extends String> parametrizedlist = new ArrayList<>();
		/*
		 * reason why the "Types safe: Potential heap pollution via varargs parameter args" warning appears on the gather(...) method
		 * @see http://stackoverflow.com/questions/12462079/potential-heap-pollution-via-varargs-parameter
		 */
		List<?> listOfParametrizedLists = gather(parametrizedlist); 
	}
	
	//@SafeVarargs
	public static <T> List<T> gather(T... args) {
		return Arrays.asList(args);
	}
}