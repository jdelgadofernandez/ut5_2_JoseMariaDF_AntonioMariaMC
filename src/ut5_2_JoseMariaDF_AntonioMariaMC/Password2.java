package ut5_2_JoseMariaDF_AntonioMariaMC;

import java.util.Random;

public class Password2 {
	
	public static boolean passwordValida(String pass) {
		boolean valido = false;
		int carac=0;
		int mayus=0;
		int minus =0;
		
		for(int i=0;i<pass.length();i++) {
			if(pass.substring(i, i+1).matches("[a-z]*")) {
				
				minus++;
				
			}else if(pass.substring(i, i+1).matches("[A-Z]*")){
				
				mayus++;
			}else if(pass.substring(i, i+1).equals(".")||pass.substring(i, i+1).equals("_")||pass.substring(i, i+1).equals("*")||pass.substring(i, i+1).equals("ñ")||pass.substring(i, i+1).equals("Ñ")){
				
				carac++;
			}
			
		}
		if(mayus>=1 && minus>2 && carac>=1) {
			
			valido=true;
			
		}
		
		
		
		
		return valido;
	}
	
	public static String generarPassword(int longitud) {
		String pass="";
		
		
		Random ale = new Random();
		for(int i=0;i<longitud;i++) {
			int genera=(int)(Math.random()*3)+1;
			if(genera==1) {
				
				
			    int numAle = ale.nextInt(26) + 65;
			    char mayusAle = (char) numAle;
			    pass+=mayusAle;
				
			}else if(genera==2) {
				
				
			    int numAle = ale.nextInt(26) + 97;
			    char minusAle = (char) numAle;
			    pass+=minusAle;
				
				
				
			}else if(genera==3) {
				
				int carAle=(int)(Math.random()*5)+1;
				
				if(carAle==1) {
					
					  pass+="Ñ";
				}else if(carAle==2) {
					
					pass+="ñ";
				}else if(carAle==3) {
					
					pass+="_";
				}else if(carAle==4) {
					
					pass+=".";
				}else if(carAle==5) {
					
					pass+="*";
				}
				
				
			}
			
			
		}
		
		
		
		
		
		return pass;
	}
	
	
	

}
