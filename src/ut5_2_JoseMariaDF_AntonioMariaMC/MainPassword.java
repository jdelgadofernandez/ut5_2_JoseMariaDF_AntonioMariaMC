package ut5_2_JoseMariaDF_AntonioMariaMC;

import java.util.Scanner;

public class MainPassword {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int longitud = 0;
		String pass1 = "";
		String pass2 = "";
		try {
			System.out.println("Introduce la longitud de la contraseña");
			longitud = sc.nextInt();
			pass1=Password.generarPassword(longitud);
			pass2=Password2.generarPassword(longitud);
			System.out.println("Password 1:" + pass1 + " " + Password.passwordValida(pass1));
			System.out.println("Password 2:" + pass2 + " " + Password2.passwordValida(pass2));
		}
		catch (Exception e) {
			System.out.println("Se ha introducido una letra cochino. Introduce un numero la proxima vez. Cerrando programa.");
		}
		
	}

}