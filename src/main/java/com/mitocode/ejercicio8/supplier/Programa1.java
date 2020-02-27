package com.mitocode.ejercicio8.supplier;

import java.util.function.Supplier;

public class Programa1 {

	public static void main(String[] args) {

		ISupplier<String> is = () -> "Dany";
		String nombres = is.get();
		System.out.println("nombres: " + nombres);
		
		ISupplier<Integer> is2 = () -> 10;
		int edad = is2.get();
		System.out.println("edad: " + edad);
		
		// Usando la interface Supplier de Java 8
		Supplier<String> is3 = () -> "Dany";
		nombres = is3.get();
		System.out.println("nombres: " + nombres);
		
		Supplier<Integer> is4 = () -> 10;
		edad = is4.get();
		System.out.println("edad: " + edad);
	}

}
