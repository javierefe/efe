package com.mitocode.ejercicio93.map;

import java.util.HashMap;
import java.util.Map;

public class Programa {

	public static void main(String[] args) {
		
		Map<String, String> paises = new HashMap<>();
		
		paises.put("PE","Peru");
		paises.put("CO","Colombia");
		paises.put("CH","Chile");
		paises.put("EC","Ecuador");
		
		
		//otra forma
		paises.entrySet().stream().forEach(System.out::println);
		System.out.println();
		
		//busca el key mexico, si no  lo ecuentra agrega
		paises.putIfAbsent("MX", "Mexico");
		paises.entrySet().stream().forEach(System.out::println);
		
		//busca un key, si no lo encuentra devuelve hola
		String valor = paises.getOrDefault("PEE", "Hola");
		System.out.println("Valor: " + valor);
		
		
		
	}

}
