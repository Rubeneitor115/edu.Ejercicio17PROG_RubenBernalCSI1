/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 281024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 281024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero, media, contador = 0, suma = 0;
		String respuesta;
		boolean continuar = false;
		Scanner sc = new Scanner(System.in);
		
		//Solicito número enteros al usuario hasta que este no desee añadir más
		do {
			System.out.println("Introduzca un número entero: ");
			numero = sc.nextInt();
			contador++;
			suma+=numero;
			System.out.println("Desea añadir otro numero? (Si/No): ");
			respuesta = sc.next();
			if(respuesta.equals("Si")) {
				continuar = false;
			}else {
				continuar = true;
			}
		}while (!continuar);
		
		//Calculo y muestro la media de todos los números enteros introducidos por el usuario
		media = suma / contador;
		System.out.println("La media de los números introducidos es: " + media);
		

	}

}
