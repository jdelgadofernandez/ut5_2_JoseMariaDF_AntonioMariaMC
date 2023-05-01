package ut5_2_JoseMariaDF_AntonioMariaMC;

import java.util.Scanner;

/*
 * Es la clase principal de nuestro projecto
 * 
 * Dada una longitud nos muestra 2 contraseñas con especificaciones distintas y comprueba si son fuertes o no
 */
public class MainPassword {

	static Scanner sc = new Scanner(System.in); // Se declara el escaner para poder utilizarlo en toda la clase
	/*
	 * Es el metodo principal de nuestro programa Se pide por consola una longitud y
	 * genera 2 contraseñas indicando si son fuertes o no
	 */

	public static void main(String[] args) {
		int longitud = 0;
		String pass1 = "";
		String pass2 = "";
		try {
			System.out.println("Introduce la longitud de la contraseña");
			longitud = sc.nextInt();
			pass1 = Password.generarPassword(longitud);
			pass2 = Password2.generarPassword(longitud);
			System.out.println("Password 1:" + pass1 + " " + Password.passwordValida(pass1));
			System.out.println("Password 2:" + pass2 + " " + Password2.passwordValida(pass2));
		} catch (Exception e) {
			System.out.println(
					"Se ha introducido una letra cochino. Introduce un numero la proxima vez. Cerrando programa.");
		}

	}

}