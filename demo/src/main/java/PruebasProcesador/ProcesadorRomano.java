package PruebasProcesador;

public class ProcesadorRomano {

	public int Convierte(String pnumRomano)throws Exception {
		int numero;
		if (pnumRomano != ""){
			int contI =0;
			int contV =0;
			int contX =0;
			int contL =0;
			int contC =0;
			int contD =0;
			int contM =0;
			char letra;
			numero =0;
			for(int i=0; i< pnumRomano.length(); i++) {	
				letra = pnumRomano.charAt(i);
				switch (letra) {
					case 'I': 
						numero++;
						contI++;	
					break;
					
				case 'V': 
					numero= numero + 5;
					contV++;
					break;
					
					case 'X': 
						numero= numero +10;
						contX++;
					break;
					
					case 'L': 
						numero= numero + 50;
						contL++;
					break;
					
					case 'C': 
						numero=  numero +100;
						contC++;
					break;
					
					case 'D': 
						numero= numero +500;
						contD++;
					break;
					
					case 'M': 
						numero= numero +1000;
						contM++;
					break;
					default: numero =0;
				}	
			}
			
			if(contI > 3) {
				throw new Exception("Error, no se permiten 4 Is");
			}
			
			if(contD > 1) {
				throw new Exception("Error, no se permiten mas de 2 Ds");
			}
			
			if(contX > 3 ) {
				throw new Exception("Error, no se permiten 3 Xs");
			}
			
			if(contC > 3) {
				throw new Exception("Error, no se permiten 3 Cs");
			}
			
			if(contL > 1) {
				throw new Exception("Error, no se permiten 1 L");
			}			
			return numero;
		}else {
			return 0;
		}
	}
}

