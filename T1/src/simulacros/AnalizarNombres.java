package simulacros;

import java.util.Scanner;

public class AnalizarNombres {

		public static void main(String[] args) {
			
			// Variables
			Scanner entrada = new Scanner(System.in);
			final String TEXT_RED = "\u001B[31m";
			final String TEXT_BLUE = "\u001B[34m";
			final String RESET = "\u001B[0m";
			boolean programaActivo = true;

			
			// Comienzo del programa

			System.out.println("¡Hola bienvenido al analizador de nombres!");
			
			while(programaActivo) {
		
				System.out.println("Por favor, introduce un nombre:");
				
				String nombre = entrada.nextLine();
				
				System.out.println("/n--- RESULTADOS ---");
				
				// Comprobación mayúsculas o minúsculas.
				
				String nombreMayusculas = nombre.toUpperCase();
				String nombreMinusculas = nombre.toLowerCase();
				
				if(nombreMayusculas.equals(nombre)) {
					System.out.println("- Nombre escrito en mayúsculas.");
				} else if (nombreMinusculas.equals(nombre)) {
					System.out.println("- Nombre escrito en minúsculas.");			
				} else {
					System.out.println("- El nombre no está ni en mayúsculas ni en minúsculas.");
				}
				
				
				// Comprobación espacios en blanco
				
				int largoNombreUsuario = nombre.length();
				int largoNombreSinEspacios = nombre.trim().length();
				
				if(largoNombreUsuario != largoNombreSinEspacios) {
					System.out.println("- El nombre introducido tiene espacios al principio o al final.");
				}
				
				// Comprobación en minúsculas y sin espacios en blanco.
				
				if (nombreMinusculas.equals(nombre) && largoNombreUsuario == largoNombreSinEspacios) {
					System.out.printf("- El número de letras de tu nombre es: "+TEXT_BLUE+largoNombreUsuario+RESET+".");
					programaActivo = false;
				} else {
					System.out.printf(TEXT_RED+"ERROR: El nombre aportado no cumple con los requisitos.%n%n"+RESET);
				}
			}
			
			entrada.close();

		}

}
