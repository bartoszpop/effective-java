package com.gmail.at.bartoszpop.effectivejava.chapter4.compatibility;

import com.gmail.at.bartoszpop.effectivejava.chapter4.compatibility.client.IndirectImplementation;

public class BinaryCompatibility {
	public static void main(String[] args) {
		
		// IndirectImplementation.class sprawdziæ jaka jest hierarchia typów gdy w classpath jest wersja BaseImplementation implementuj¹ca interfejs i nie implementuj¹ca
		System.out.println(new IndirectImplementation());
	}
}