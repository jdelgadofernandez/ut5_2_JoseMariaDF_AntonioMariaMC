package ut5_2_JoseMariaDF_AntonioMariaMC;

import java.util.Random;

public class Password {
	
	public static boolean passwordValida(String contrasena) {
		int mayus=0;
		int minus=0;
		int num=0;
		
		for(int i=0;i<contrasena.length();i++) {
			String letra = contrasena.substring(i,i+1);
			if (letra.matches("[A-Z]*")) {
				mayus++;
			}
			else if (letra.matches("[a-z]*")) {
				minus++;
			}
			else if (letra.matches("[0-9]*")) {
				num++;
			}
			
		}
		if (mayus>=1 && minus>2 && num>=1) {
			return true;
		}
		else return false;
		
		
	}
	
	public static String generarPassword(int longitud) {
		int tipo = 0;
		String password= "";
		Random r = new Random();
		System.out.println("Generando Contraseña");
		while(password.length()<longitud) {
			tipo = (int) (Math.random()*3)+1;
			switch (tipo) {
			case 1:
				char c = (char)(r.nextInt(26) + 'A');
				password= c+password;
				break;
			case 2:
				c = (char)(r.nextInt(26) + 'a');
				password= c+password;
				break;
			case 3:
				int num = (int)(Math.random()*3)+1;
				password= num+password;
				break;
			default:
				System.out.println("Error en el aleatorio");
				break;
			}
			
		}
		return password;
	}
}
