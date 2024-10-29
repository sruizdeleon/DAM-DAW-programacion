package com.ejercicios.tema2;

public class ejercicio_06 {

	public static void main(String[] args) {

		/*
		 * 
		 * 1. Declara dos variables booleanas esAdulto con el valor true y
		 * esEmpleado con el valor false.
		 * 2. Realiza las siguientes operaciones lógicas e imprime
		 * los resultados:
		 * - esAdulto && esEmpleado (AND lógico)
		 * - esAdulto || esEmpleado (OR lógico)
		 * - !esAdulto (NOT lógico)
		 * 
		 * 
		 */
		
		boolean esAdulto = true;
		boolean esEmpleado = false;
		
		System.out.println("esAdulto && esEmpleado: " + (esAdulto && esEmpleado));
		System.out.println("esAdulto || esEmpleado: " + (esAdulto || esEmpleado));
		System.out.println("!esAdulto: " + (!esAdulto));
		
	}
}
