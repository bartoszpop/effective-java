package com.gmail.at.bartoszpop.effectivejava.chapter4.compatibility;

import com.gmail.at.bartoszpop.effectivejava.chapter4.compatibility.client.IndirectImplementation;

public class BinaryCompatibility {
	public static void main(String[] args) {
		
		// IndirectImplementation.class sprawdzi� jaka jest hierarchia typ�w gdy w classpath jest wersja BaseImplementation implementuj�ca interfejs i nie implementuj�ca
		System.out.println(new IndirectImplementation());
	}
}