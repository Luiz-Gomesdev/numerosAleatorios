package com.luiz.NumerosAleatorios;

import java.util.Random;

public class JavaNumerosAleatorios {
	
	public static void main(String[] args) {
		
		System.out.println(Math.floor(Math.random() * 100));
		
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt());
		
		System.out.println(aleatorio.nextInt(10 + 1));
	}

}
