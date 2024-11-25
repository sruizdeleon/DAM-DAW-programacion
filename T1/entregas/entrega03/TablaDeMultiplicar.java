package entrega03;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		
		/**
	 	@author		Sergio Ruiz de León
	 	@version	1.0
	 	@date		2024-11-03
	 	
	 	Escribe un programa que solicite al usuario un número entero y luego muestre la
		tabla de multiplicar de ese número, del 1 al 10. Cada línea de la salida debe mostrar la
		operación en el formato X * i = resultado.
		
		*/
		
		// iniciamos un escaner
		Scanner escaner = new Scanner(System.in);
		
		int number;	// variable para almacenar el número del usuario

		// escribimos la primera instrucción al usuario
		System.out.println("Escribe un número entero: ");
		
		// iniciamos buble infinito
		while(true) {
			// si el input introducido es un entero
			if(escaner.hasNextInt()) {
				// asignamos el valor a la variable number
				number = escaner.nextInt();
				
				// usamos un bucle for para iterar de 1 a 10
				for(byte i = 1; i <= 10; i++) {
					// mostramos por pantalla el número, la i y el resultado
					System.out.println(number + " * " + i + " = " + (number * i));
				}
				
				// rompemos el bucle
				break;
				
			}
			// si el input no es un número, no es un entero o está fuera del rango de un int
			else {
				// mandamos mensaje de error
				System.out.println("ERROR: No has introducido un número o no era válido.");
				// volvemos a mandar las instrucciones iniciales
				System.out.println("Escribe un número entero: ");
				// consumimos el input y esperamos uno nuevo
				escaner.next();
			}
		}
		
		// cerramos el escaner
		escaner.close();
	}

}
