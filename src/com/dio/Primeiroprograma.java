package com.dio;

import com.dio.model.Gato;

public class Primeiroprograma {

	public static void main(String[] args) {
		/* int a = 2;
		int b = 3;
		System.out.println("Hello World" + (a+b));*/
		
		Gato gato = new Gato(); 
		Canetas canetas = new Canetas();
		
		System.out.println(gato);
		System.out.println(canetas);
	}
}

class Canetas {
		private String nome;
		private String npag;
}
