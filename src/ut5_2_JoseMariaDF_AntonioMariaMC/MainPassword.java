package ut5_2_JoseMariaDF_AntonioMariaMC;

public class MainPassword {

	public static void main(String[] args) {
		
		
		String pass=Password2.generarPassword(10);
		
		System.out.println(pass +" "+Password2.passwordValida(pass));

	}

}
