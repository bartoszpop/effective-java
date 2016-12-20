package com.gmail.at.bartoszpop.effectivejava.chapter6.item29;

@SuppressWarnings("unused")
public class AsSubclass {
	public static void main(String[] args) {
		/*
    	 * @formatter:off
    	 * Used for example when type is known only in runtime
    	 * @see http://stackoverflow.com/questions/1555326/java-class-cast-vs-cast-operator
    	 * @formatter:on
    	 */
		Class<? extends Object> subclass = String.class.asSubclass(Object.class);
	}
}