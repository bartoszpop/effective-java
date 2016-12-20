package com.gmail.at.bartoszpop.effectivejava.chapter4.compatibility;

public interface ConstantInterface {
	public static final int CONSTANT_INT = 1;
	
	public static final String CONSTANT_STRING = "Constant String"; // inlined
	
	public static final Object CONSTANT_OBJECT = new Object() { //not inlined
		public String toString() {
			return "Constant Object";
		}
	};
}
