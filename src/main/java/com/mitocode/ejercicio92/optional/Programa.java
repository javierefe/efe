package com.mitocode.ejercicio92.optional;

import java.util.Optional;

public class Programa {

	public static void main(String[] args) {
		
		String nombre = null;
		//System.out.println(nombre.toUpperCase());
		
		//optional 
		//nombre = "dany";
		Optional<String> op = Optional.ofNullable(nombre);
		//String nombre2 = op.get();
		//System.out.println(nombre2);
		
		System.out.println(op.isPresent());//validar si el valor que se le puso es correcta 
		
		nombre = op.orElse("Juan"); // si el valor es nulo se le asigna un valor por defecto
		
		System.out.println(nombre);
		
	}

}
