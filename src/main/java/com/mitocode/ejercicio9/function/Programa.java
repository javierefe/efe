package com.mitocode.ejercicio9.function;

import java.util.function.Function;

public class Programa {

	public static void main(String[] args) {
		
		IFunction<Integer, Integer> fn = (x) -> x * x;
		int entero = fn.apply(5);
		System.out.println(entero);
		
		// Usando la interface Function de Java 8
		Function<Double, Double> fn2 = (x) -> x * x;
		double decimal = fn2.apply(5.0);
		System.out.println(decimal);
	}
}
